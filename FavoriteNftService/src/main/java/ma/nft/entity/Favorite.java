package ma.nft.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Document("favorite")
public class Favorite {
	
	@Id
    private String id;
    private String iduser;
    private String idNFT;
	public String getIduser() {
		// TODO Auto-generated method stub
		return iduser;
	}
	public Object getIdNFT() {
		// TODO Auto-generated method stub
		return idNFT;
	}
	
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
