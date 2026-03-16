class Piece
{
  static String name;
  static String theme;
  static String brand;
  static String colour;
  static String style;
  static String material;
  static String occasion;
  static String productDimensions;
  static String cartoonCharacter;
  static String ageRange;
  int numberOfPieces;
  public static void main(String[] args)
  {
   String name = "luckyOwl";
   String theme = "Nature";
   String brand = "Xtore";
   String colour = "Gold";
   String style = "Modern";
   String material	= "Resin";
   String occasion	= "Decorative";
   String productDimensions= "11.5L x 7W x 14.5H Centimeters";
   String cartoonCharacter = "Owl";
   String ageRange = "All Ages";
   int numberOfPieces	= 1;

   System.out.println("Name: "+name);
   System.out.println("Theme:"+theme);
   System.out.println("Brand: "+brand);
   System.out.println("Colour: "+colour);
   System.out.println("Style: "+style);
   System.out.println("Material: "+material);
   System.out.println("Occasion: "+occasion);
   System.out.println("Product Dimensions: "+productDimensions);
   System.out.println("Cartoon Character: "+cartoonCharacter);
   System.out.println("AgeRange: "+ageRange);
   System.out.println("Number Of Pieces: "+numberOfPieces);
  }
}