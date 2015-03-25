import acm.graphics.*;

public class SteganographyLogic {
	/**
	 * Given a GImage containing a hidden message, finds the hidden message
	 * contained within it and returns a boolean array containing that message.
	 * <p>
	 * A message has been hidden in the input image as follows.  For each pixel
	 * in the image, if that pixel has a red component that is an even number,
	 * the message value at that pixel is false.  If the red component is an odd
	 * number, the message value at that pixel is true.
	 * 
	 * @param source The image containing the hidden message.
	 * @return The hidden message, expressed as a boolean array.
	 */
	public static boolean[][] findMessage(GImage source) {
		/* TODO: Implement this! */
		return null;
	}
	
	/**
	 * Hides the given message inside the specified image.
	 * <p>
	 * The image will be given to you as a GImage of some size, and the message will
	 * be specified as a boolean array of pixels, where each white pixel is denoted
	 * false and each black pixel is denoted true.
	 * <p>
	 * The message should be hidden in the image by adjusting the red channel of all
	 * the pixels in the original image.  For each pixel in the original image, you
	 * should make the red channel an even number if the message color is white at
	 * that position, and odd otherwise.
	 * <p>
	 * You can assume that the dimensions of the message and the image are the same.
	 * <p>
	 * 
	 * @param message The message to hide.
	 * @param source The source image.
	 * @return A GImage whose pixels have the message hidden within it.
	 */
	public static GImage hideMessage(boolean[][] message, GImage source) {
		/* TODO: Implement this! */
		return null;
	}
}
