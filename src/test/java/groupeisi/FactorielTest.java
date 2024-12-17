package groupeisi;

import com.groupeisi.Factoriel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorielTest {
  @Test
  public void testFactoriel() {
      //Given
      int nombre = 5;
      int factoriel = 120;
        Factoriel f = new Factoriel();
      //When
      int resultat = f.factoriel(nombre);

      //Then
      assertEquals(factoriel, resultat);

  }

    @Test
    public void testFactoriel1() {
        //Given
        int nombre = 0;
        int factoriel = 1;
        Factoriel f = new Factoriel();
        //When
        int resultat = f.factoriel(nombre);

        //Then
        assertEquals(factoriel, resultat);

    }

}
