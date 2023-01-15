package ma.nft.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.nft.entity.Favorite;
import ma.nft.services.FavoriteService;




@RestController
public class FavoriteController {


	@Autowired 
	FavoriteService favoriteService ;
	
	@PostMapping("/Favorite/addFavorite")
	public  ResponseEntity<?> saveFavorite(@RequestBody Favorite favorite) {
		int i =0;
		 List<Favorite> favoriteList =	favoriteService.getall(favorite.getIduser());
		for(Favorite elementFav : favoriteList)
		{			

			if( elementFav.getIdNFT().equals(favorite.getIdNFT())) {
				i++;
				System.out.println( elementFav.getIdNFT()+ "/"+ favorite.getIdNFT());
}
		}
		
		System.out.println(i);

		if(i==0) {
        return new ResponseEntity<>(favoriteService.save(favorite), HttpStatus.CREATED);
		}
        return new ResponseEntity<>("NFT DEJA EXIST DANS favorite", HttpStatus.NOT_IMPLEMENTED);

	}
	
	@GetMapping("/Favorite/findAllFavorite/{id}")
	public ResponseEntity<?> getFavorite(@PathVariable String id){
		//return PanierService.getall(id);
		return	ResponseEntity.ok(favoriteService.getall(id));
	}
	

	@DeleteMapping("/Favorite/delete/{id}")
	public void deleteFavorite(@PathVariable("id") String id) {
		favoriteService.delete(id);
		
	}
	
	

	@DeleteMapping("/Favorite/deleteBuyFav/{id}")
	public String deleteFavBuy(@PathVariable("id") String idnft) {
		favoriteService.deleteBuyNft(idnft);
		return "favorite deleted with idnft : " + idnft;
	}
	
	
	@GetMapping("/Favorite/favoriteMust")
	public  ResponseEntity<?> favoriteMust(){
		//return PanierService.MustFav();
	return	ResponseEntity.ok(favoriteService.MustFav());
}
}