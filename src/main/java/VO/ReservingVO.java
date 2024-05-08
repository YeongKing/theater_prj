package VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ReservingVO {
	
	private String screeningCode, movieTitle, movieRating, screeningDate, theaterName, theaterNumber, screeningTime;
	private int ticketPrice, screeningRound;

} // class