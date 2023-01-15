package ma.nft.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.nft.entity.Panier;
import ma.nft.repository.PanierRepository;

@Service
public class PanierServiceImpl implements PanierService{

	

	@Autowired
	private PanierRepository panierrepository;

	@Override
	public Panier save(Panier panier) {
		// TODO Auto-generated method stub
		
		return panierrepository.save(panier);

		
	}

	@Override
	public List<Panier> getall(String id) {
		// TODO Auto-generated method stub
		return panierrepository.findByIduser(id);
	
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		panierrepository.deleteById(id);

	}

	@Override
	public void deletebuynft(String id) {
		// TODO Auto-generated method stub
		panierrepository.deletePanierByIdNFT(id);

	}
}
