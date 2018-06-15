package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {

	private Review firstReview = new Review(1L, "review title", "image URL", "review category", "review content");
	
	@Test
	public void shouldBeAbleToReturnAllProperties() {
		String reviewTitle = firstReview.getTitle();
		String reviewUrl = firstReview.getUrl();
		String reviewCategory = firstReview.getCategory();
		String reviewContent = firstReview.getContent();
		assertThat(reviewTitle, is("review title"));
		assertThat(reviewUrl, is("image URL"));
		assertThat(reviewCategory, is("review category"));
		assertThat(reviewContent, is("review content"));
	}
	
}
