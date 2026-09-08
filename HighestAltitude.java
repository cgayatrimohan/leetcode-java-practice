package leetCode;
/**
 * Approach: Prefix Sum
 * 
 * Algorithm

    Initialize the variable currentAltitude to 0; this is the current altitude of the biker.
    Initialize the variable highestPoint to currentAltitude, as the highest altitude we have seen is 0.
    Iterate over the gain in altitude in the list gain and add the current gain altitudeGain to the variable currentAltitude.
    Update the variable highestPoint as necessary.
    Return highestPoint.

 */
public class HighestAltitude {

	public static int findHighestAltitude(int[] gain) {
		int currentAltitude = 0;
		
		int highestPoint = currentAltitude;
		
		for(int altitudeGain : gain) {
			currentAltitude += altitudeGain;
			highestPoint = Math.max(highestPoint, currentAltitude);
		}
		return highestPoint;
	}
}
