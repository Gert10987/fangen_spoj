
public class FanFactory {
    
    /*
     * @param directionOfRotation kierunek obrotu "left" lub "right"
     * @return leftRotationFan wiatrak o kieunku lewym
     * @return rightRotationFan wiatrak o kieunku prawym
     * @return null
     */
    public Fan getFan(String directionOfRotation){
	
	if (directionOfRotation.equalsIgnoreCase("LEFT")){	    
	    return new LeftRotationFan();	    
	} else if (directionOfRotation.equalsIgnoreCase("RIGHT")){ 
	    return new RightRotationFan();
	}
	return null;
    }
}
