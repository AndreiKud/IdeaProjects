package com.company;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseZoom;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.universe.SimpleUniverse;

import javax.media.j3d.*;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;
import java.applet.Applet;
import java.awt.*;

//   MouseRotate2App renders a single, interactively rotatable cube.

public class MouseRotate2App extends Applet {

    public static int side = 512;
    public BranchGroup createSceneGraph() {
        // Create the root of the branch graph
        BranchGroup objRoot = new BranchGroup();

        TransformGroup objRotate = null;
        MouseRotate myMouseRotate = null;
        Transform3D transform = new Transform3D();

        // create ColorCube and MouseRotate behavior objects
        transform.setTranslation(new Vector3f(-0.6f, 0.0f, -0.6f));
        objRotate = new TransformGroup(transform);
        objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);

        objRoot.addChild(objRotate);
        objRotate.addChild(new ColorCube(0.4));

        myMouseRotate = new MouseRotate();
        myMouseRotate.setTransformGroup(objRotate);
        myMouseRotate.setSchedulingBounds(new BoundingSphere());
        objRoot.addChild(myMouseRotate);

        // create ColorCube and MouseRotate behavior objects
        transform.setTranslation(new Vector3f(0.6f, 0.0f, -0.6f));
        objRotate = new TransformGroup(transform);
        objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        objRotate.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);

        objRoot.addChild(objRotate);
        objRotate.addChild(new ColorCube(0.3));

        myMouseRotate = new MouseRotate();
        myMouseRotate.setTransformGroup(objRotate);
        myMouseRotate.setSchedulingBounds(new BoundingSphere());
        objRoot.addChild(myMouseRotate);

        // Let Java 3D perform optimizations on this scene graph.
        objRoot.compile();

        return objRoot;
    } // end of CreateSceneGraph method of MouseRotate2App

    // Create a simple scene and attach it to the virtual universe

    public MouseRotate2App() {
        setLayout(new BorderLayout());
        Canvas3D canvas3D = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
        add("Center", canvas3D);

        BranchGroup scene = createSceneGraph();

        // SimpleUniverse is a Convenience Utility class
        SimpleUniverse simpleU = new SimpleUniverse(canvas3D);

        // This will move the ViewPlatform back a bit so the
        // objects in the scene can be viewed.
        simpleU.getViewingPlatform().setNominalViewingTransform();
        simpleU.addBranchGraph(scene);
    } // end of MouseRotate2App (constructor)

    //  The following allows this to be run as an application
    //  as well as an applet

    public static void main(String[] args) {
        System.out
                .print("MouseRotate2App.java \n- a demonstration of using the MouseRotate ");
        System.out
                .println("utility behavior class to provide interaction in a Java 3D scene.");
        System.out
                .println("Hold the mouse button while moving the mouse to make the cube rotate.");
        System.out
                .println("This is a simple example progam from The Java 3D API Tutorial.");
        System.out.println("The Java 3D Tutorial is available on the web at:");
        System.out.println("http://www.sun.com/desktop/java3d/collateral");
        Frame fr = new MainFrame(new MouseRotate2App(), side, side);
        fr.setLocationRelativeTo(null);
    } // end of main (method of MouseRotate2App)

} // end of class MouseRotate2App