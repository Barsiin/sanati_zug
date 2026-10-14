public class Zug
{
    private String bezeichnung;
    private int wagen;
    private boolean klimatisiert;

    
   public Zug ( String neuBezeichnung, int neuWagen, boolean neuKlimatisiert)
   {
     setBezeichnung(neuBezeichnung);
     setWagen( neuWagen);
     setKlimatisiert( neuKlimatisiert);
   }
   
   public Zug ( String neuBezeichnung, int neuWagen )
   {
     setBezeichnung(neuBezeichnung);
     setWagen( neuWagen);
     setKlimatisiert( false );
   }
   
   public Zug ( String neuBezeichnung, boolean neuKlimatisiert)
   {
     setBezeichnung(neuBezeichnung);
     setWagen(0);
     setKlimatisiert( neuKlimatisiert);
   }
   
   public Zug ( int neuWagen, boolean neuKlimatisiert)
   {
     setBezeichnung( "UNKN");
     setWagen( neuWagen);
     setKlimatisiert( neuKlimatisiert);
   }
   
   public Zug ( )
   {
     setBezeichnung("UNKN");
     setWagen( 0 );
     setKlimatisiert( false );
   }
   
     public String getBezeichnung()
   {
    return bezeichnung;
   }

   public int getWagen()
   {
       return wagen;
   }
   
   public boolean getKlimatisiert()
   {
       return klimatisiert;
   }
   
   public void setBezeichnung(String neuBezeichnung)
   {
       bezeichnung = neuBezeichnung;
   }
   
   public void setWagen ( int neuWagen)
   {
       wagen = neuWagen;
   }
   
   public void setKlimatisiert ( boolean neuKlimatisiert )
   {
       klimatisiert = neuKlimatisiert;
   }
   
   
}
