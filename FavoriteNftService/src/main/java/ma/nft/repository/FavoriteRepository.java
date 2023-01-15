package ma.nft.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import ma.nft.entity.Favorite;



public interface FavoriteRepository extends MongoRepository<Favorite, String>  {
	
	List<Favorite> findByIduser(String iduser);
	 
	 void deleteFavoriteByIdNFT(String idnft);
	 
	 @Aggregation(pipeline = {
	            "{ $group: { _id: '$idNFT', count: { $sum: 1 } } }",
	            "{ $sort: { count: -1 } }",
	            "{ $limit: 1 }"
	    })
	    Favorite findMostRepeated();

}
