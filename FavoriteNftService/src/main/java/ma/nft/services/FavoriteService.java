package ma.nft.services;

import java.util.List;

import ma.nft.entity.Favorite;


public interface FavoriteService {
	public Favorite save( Favorite favorite);
	public List<Favorite> getall( String id);
	public void delete( String id);
	void deleteBuyNft(String id);
	public Favorite MustFav();
}
