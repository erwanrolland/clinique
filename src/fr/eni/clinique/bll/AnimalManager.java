package fr.eni.clinique.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.clinique.bo.Animal;
import fr.eni.clinique.bo.Personnel;
import fr.eni.clinique.dal.AnimalDAO;
import fr.eni.clinique.dal.DALException;
import fr.eni.clinique.dal.DAOFactory;

public class AnimalManager {
	private AnimalDAO animalDao = DAOFactory.getAnimalDAO();
	private static AnimalManager animalManager;

	public AnimalManager() {
	}

	public static synchronized AnimalManager getInstance() throws BLLException {
		if (animalManager == null) {
			animalManager = new AnimalManager();
		}
		return animalManager;
	}
	
	
	public List<Animal> getAllAnimal() throws BLLException{

		try {
			return animalDao.selectAll();
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	public List<Animal> getAnimalByClient(int codeclient)throws BLLException{
		try {
			List<Animal> listAnimal = animalDao.selectAll();
			List<Animal> listAnimalByClient = new ArrayList<Animal>();
				for (Animal a : listAnimal){
					if (a.getCodeClient() == codeclient){
						listAnimalByClient.add(a);	
					}
				}
				return listAnimalByClient;
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
