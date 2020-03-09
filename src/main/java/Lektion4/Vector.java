package Lektion4;

public class Vector implements IVector{
    
    private int x, y;
    
    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void times(int k) {
        x = x*k;
        y = y*k;
    }
    
    @Override
    public void add(IVector v) {
        x = x + v.getXY()[0];
        y = y + v.getXY()[1];
    }
    
    @Override
    public boolean equal(IVector v) {
        if(x == v.getXY()[0] && y == v.getXY()[1]) return true;
        return false;
    }
    
    public int[] getXY() {
        return new int[]{x, y};
    }
    
}
