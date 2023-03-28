public class Pointer3D {
    public int x;
    public int y;
    public int z;

    public Pointer3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object obj){ 
        if(this == obj) return true;
        
        if(obj == null || this.getClass() != obj.getClass()) return false;

        
        Pointer3D other = (Pointer3D) obj;
        if(this.x == other.x &&
            this.y == other.y &&
            this.z == other.z) return true;

        return false;

    }
}
