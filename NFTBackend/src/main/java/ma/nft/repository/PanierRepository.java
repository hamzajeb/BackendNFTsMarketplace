package ma.nft.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ma.nft.entity.Panier;

@Repository
public interface PanierRepository extends MongoRepository<Panier, String> {
 

	List<Panier> findByIduser(String iduser);
	 
	 void deletePanierByIdNFT(String idnft);
}
