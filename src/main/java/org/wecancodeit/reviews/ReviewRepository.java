package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review megaShark = new Review(1L, "Mega Shark vs. Giant Octopus", "/images/megashark.jpg", "Action", "Debbie Gibsons finest hour comes with a gritty, mesmerising performance in what has to be described as the film of the decade.\r\n" + 
				"\r\n" + 
				"The plot, written by premier director Jack Perez, focuses on the age old undersea battle between the two aquatic giants of the sea, which, as we all know, is that of the Shark and the Octopus.\r\n" + 
				"\r\n" + 
				"It was only after watching the film 8 times I was informed that the crisp special effects had been done using CGI......incredible! The shark is so lifelike i literally voided my bowels every time this nauseating monster came into shot Perhaps the biggest highlight, of this orgasmic blockbuster, is the romantic sub plot involving Gibson and Vic Chao. Thrown together in a time of world catastrophe the two scientists battle masterfully subtle feelings of sexual tension........now I don't want to spoil it for anyone, but lets just say there is a groundbreaking, red hot conclusion that will leave you shocked and stunned ;) The sequel, Massive Panda vs Quite Tall Aardvark, is due to hit our screens early in 2010, and, if this film is anything to go by, you will need to make advanced bookings at your local cinemas. During a private screening of the first rough cut, 31 people suffered crush injuries while fleeing in terror.");
		Review sharknado = new Review(2L, "Sharknado", "/images/sharknado.jpg", "Action", "I only wish this movie had been released to Drive-In theaters and been promoted on a twin bill with any other low rent/grade/brow cinematic masterpiece from the ill human beings at SyFy.\r\n" + 
				"\r\n" + 
				"To paraphrase Elvis Costello- I just don't know where to begin.. Wooden acting, special effects from a Midwestern middle school science fair, a script that veers wildly from insipid to bizarre to total nonsense, actors that should face summary execution if they made only scale and still cashed their paychecks, a director that makes Ed Wood look like Ingmar Bergman. In other words a glorious triumph of B-grade movie making..\r\n" + 
				"\r\n" + 
				"As you take in the visceral train wreck (that could only be better if released in grainy 8mm), you are reminded of what good/bad scifi is. Absolute suspension of disbelief, pure enjoyment of the insanity of it all, and a curious thought that you could not enjoy life more if you were shotgunned Thai sticks by Godzilla himself..\r\n" + 
				"\r\n" + 
				"It is the generic Twinkie of B movies. Made all the better by the fact that it IS a cheap, sickeningly self indulgent wad of fluff that you feel doubly guilty of consuming.\r\n" + 
				"\r\n" + 
				"God help me I do love it so....");
		Review husk = new Review(3L, "Husk", "/images/husk.jpg", "Horror", "I got to watch this movie for Scarecrow killer, nails and CJ Thomason. Movie starts right away, five young people driving and suddenly... bam. Don't want to tell the whole story right away. True, the movie is full of plot holes and unexplained things and it's not realistic. But, if you are a horror fan who is not seeking for 'most rational movie award', but instead a great fright, this should do. Two things I loved about this movie are that it's very spooky and unpredictable. Atmosphere is dark and corn field, scarecrow, abandoned house and crows are just a bonus. Blood is realistic and the fear is all around. Trust me, you'll never be board. And I dare you, after you see the cast, just please tell me who's gonna be a main character. I really dare you. It's not your typical virgin, yet proud and brave teenage girl. Three main characters are easy to connect with. The acting is very good. And the killer is awesome looking. Of course that his back-story is very vague, full of unexplained things and incomplete, but at least he looks cool and kills in a very nasty ways. I think it's actually a pretty good horror movie. Not a complete movie with everything about everyone, but a really good segment what happens in an abandoned cursed corn field. Don't expect an Academy Award winning drama, but suspense is guaranteed.");
		
		reviewList.put(megaShark.getId(), megaShark);
		reviewList.put(sharknado.getId(), sharknado);
		reviewList.put(husk.getId(), husk);
		
	}

	public ReviewRepository(Review... reviews) {
		for(Review review : reviews) {
			reviewList .put(review.getId(), review);
		}
	}

	public Review findReview(long reviewId) {
		return reviewList.get(reviewId);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}
