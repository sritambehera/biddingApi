package biddingApi.biddingApi.Model;

import java.util.List;

import biddingApi.biddingApi.Entities.BiddingData.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public @Data class BidPutRequest {

	private Long rate;
	private Unit unitValue;
	private List<String> truckId;

	private Boolean transporterApproval;
	private Boolean shipperApproval;

	private String biddingDate;
}
