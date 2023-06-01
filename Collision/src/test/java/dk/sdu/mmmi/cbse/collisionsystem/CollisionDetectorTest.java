package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;

import static org.junit.jupiter.api.Assertions.*;

class CollisionDetectorTest {

    private CollisionDetector collisionDetector;
    Entity entityOne = new Entity();
    Entity entityTwo = new Entity();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        collisionDetector = new CollisionDetector();
        PositionPart positionPartOne = new PositionPart(0,5,0);
        PositionPart positionPartTwo = new PositionPart(5,10,0);
        entityOne.setRadius(100);
        entityTwo.setRadius(100);
        entityOne.add(positionPartOne);
        entityTwo.add(positionPartTwo);
    }

    @org.junit.jupiter.api.Test
    void collides() {
        assertEquals(true, collisionDetector.collides(entityOne,entityTwo));
    }

}