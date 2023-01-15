package ma.nft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.nft.entity.Favorite;
import ma.nft.repository.FavoriteRepository;


@Service
public class FavoriteServiceImpl implements FavoriteService{

	@Autowired
	private FavoriteRepository favoriteRepository; 
	@Override
	public Favorite save(Favorite favorite) {
		// TODO Auto-generated method stub
		return favoriteRepository.save(favorite) ;
	}

	@Override
	public List<Favorite> getall(String id) {
		// TODO Auto-generated method stub
		return favoriteRepository.findByIduser(id);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		favoriteRepository.deleteById(id);
		
	}

	@Override
	public void deleteBuyNft(String id) {
		// TODO Auto-generated method stub
		favoriteRepository.deleteFavoriteByIdNFT(id);
	}
	
	@Override
	public Favorite MustFav() {
		// TODO Auto-generated method stub
		 
		return favoriteRepository.findMostRepeated();
	}

}
