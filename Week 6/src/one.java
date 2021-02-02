public class one{
    public static  void main(String[] args){
        Artwork art = new Artwork("ABC","123");
        System.out.print("Name of the Artist " + art.value + "\n" + art.getArtwork());
    }
}

class Artwork{
    String value;
    String name;
    //Constructor
    public Artwork(){
        this.name = "Ram";
        this.value = "9000";
    }
    //Getter
    String getArtwork() {
        return name +" " + value;
    }

    //Setter
	public Artwork(String name, String value) {
		this.name = name;
		this.value = value;
    }
    
    class Material{
        String material, width;

        public Material(String material, String width) {
            this.material = material;
            this.width = width;
        }
    }

    class Properties{
        String paint_type;
        int height, width;

        public Properties(String paint_type, int height, int width) {
            this.paint_type = paint_type;
            this.height = height;
            this.width = width;
        }
        
    }

    



}