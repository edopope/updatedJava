package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderClassTest {
    @Test
    public void testVolumeOfCylinder(){
        CylinderClass cylinder = new CylinderClass();
        System.out.printf("the volume of the cylinder is %d", cylinder.volumeOfCylinder(3,12));
    }

}