package ma.nft.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import ma.nft.entity.Panier;

public interface PanierService {
	public Panier save( Panier panier);
	public List<Panier> getall( String id);
	public void delete( String id);
	void deletebuynft(String id);

}
