package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	
	ReviewRepository underTest;
	
	private Review firstReview = new Review(1L, "review title", "image URL", "review category", "review content");
	private Review secondReview = new Review(2L, "review title", "image URL", "review category", "review content");

	@Test
	public void shouldBeAbleToFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review foundReview = underTest.findReview(firstReview.getId());
		assertThat(foundReview, is(firstReview));
	}
	
	@Test
	public void shouldBeAbleToFindASecondReview() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Review foundReview = underTest.findReview(secondReview.getId());
		assertThat(foundReview, is(secondReview));
	}
	
	@Test
	public void shouldBeAbleToFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> reviewList = underTest.findAllReviews();
		assertThat(reviewList, containsInAnyOrder(firstReview, secondReview));		
	}
	
}
