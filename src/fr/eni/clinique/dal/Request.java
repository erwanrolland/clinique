package fr.eni.clinique.dal;

import fr.eni.clinique.bo.Client;


public abstract class Request {
	
	public static String getArticleRequestInsert(Client client) {
		
		StringBuilder sql = new StringBuilder("INSERT INTO clients");

		sql.append("(codeclient,nomclient,prenomclient,adresse1,adresse2,codepostal,ville,numtel,"
				+ "assurance,email,remarque,archive)");
		sql.append(" VALUES ('");
		sql.append(client.getCodeClient());
		sql.append("', '");
		sql.append(client.getNomClient());
		sql.append("', '");
		sql.append(client.getPrenomClient());
		sql.append("', ");
		sql.append(client.getAdresse1());
		sql.append(", ");
		sql.append(client.getAdresse2());
		sql.append(", ");
		sql.append(client.getCodePostal());
		sql.append(", ");
		sql.append(client.getVille());
		sql.append(", ");
		sql.append(client.getNumTel());
		sql.append(", ");
		sql.append(client.getAssurance());
		sql.append(", ");
		sql.append(client.getEmail());
		sql.append(", ");
		sql.append(client.getRemarque());
		sql.append(", ");
		sql.append(client.isArchive());
		sql.append(")");
		return sql.toString();
	}
	
	public static String getClientRequestSelectAll() {
		return "SELECT * FROM dbo.clients";
	}
	
	public static String getClientRequestSelectById(int id) {
		return "SELECT * FROM dbo.clients WHERE idArticle = " + id;
	}

	public static String getClientRequestDelete(Client client) {
		return "DELETE FROM dbo.clients WHERE idArticle = " + client.getCodeClient();
	}
	
	
	
}