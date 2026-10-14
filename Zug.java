public class Zug
{
    private String bezeichnung;
    private int wagen;
    private boolean klimatisiert;
    
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
