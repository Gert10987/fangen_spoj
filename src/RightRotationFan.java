
public class RightRotationFan extends Fan{
    
    /* drukuje wiatrak prawoskretny 
     * @return void
     * @see Fan#print()
     */
    @Override
    public void print() {
		
	for (int i = 0; i < tab.length; i++) {
	    for (int j = 0; j < tab.length; j++) {
		System.out.print(tab[i][j]);
	    }
	    System.out.println("");
	}
    }
}
