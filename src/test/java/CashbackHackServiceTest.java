import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void CashbackHackServiceTestOne (){
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(500);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CashbackHackServiceTestTwo (){
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CashbackHackServiceTestThree (){
        CashbackHackService service = new CashbackHackService();

        int expected = 800;
        int actual = service.remain(200);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CashbackHackServiceTestFour (){
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual,expected);
    }
}
