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

import ma.nft.entity.Panier;
import ma.nft.services.PanierService;


@RestController
public class Paniercontroller {


	@Autowired 
	PanierService PanierService ;
	
	@PostMapping("/Panier/addpanier")
	public  ResponseEntity<?> savepanier(@RequestBody Panier panier) {
		int i =0;
		 List<Panier> panierlist=	PanierService.getall(panier.getIduser());
		for(Panier item : panierlist)
		{			

			if(item.getIdNFT().equals(panier.getIdNFT())) {
				i++;
				System.out.println(item.getIdNFT()+ "/"+ panier.getIdNFT());
}
		}
		
		System.out.println(i);

		//return "Added panier with iduser: " + panier.getIduser();
		if(i==0) {
        return new ResponseEntity<>(PanierService.save(panier), HttpStatus.CREATED);
		}
        return new ResponseEntity<>("NFT DEJA EXIST DANS LE PANIER", HttpStatus.NOT_IMPLEMENTED);

	}
	
	@GetMapping("/Panier/findAllPanier/{id}")
	public ResponseEntity<?> getpanier(@PathVariable String id){
	
		return	ResponseEntity.ok(PanierService.getall(id));
	}
	

	@DeleteMapping("/Panier/delete/{id}")
	public void deletepanier(@PathVariable("id") String id) {
		PanierService.delete(id);
		
	}

	@DeleteMapping("/Panier/deleteBuyPanier/{id}")
	public String deletepanierBuy(@PathVariable("id") String idnft) {
		PanierService.deletebuynft(idnft);
		return "Panier deleted with idnft : " + idnft;
	}
}