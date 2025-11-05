import org.example.ListReader;
import org.example.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectedListTest {
    @Test
    public void testConnectedList(){
        Node A = new Node("A", new Node("B"), 2.0f);
        assertEquals("B", A.getConnectedList().get(0).getName());
    }
}
