package com.codeslogan.shuey;

import java.applet.*;
import java.awt.*;
import java.io.IOException;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;

import javax.media.j3d.*;
import javax.vecmath.*;

import com.sun.j3d.utils.behaviors.mouse.*;


public class ShueyRhon extends Applet {
    public BranchGroup createBranchGroupSceneGraph() throws IOException {
        BranchGroup BranchGroupRoot = new BranchGroup();
        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
        //背景颜色
        Color3f bgColor = new Color3f(0.0f, 0.65f, 0.65f);
        Background bg = new Background(bgColor);
        bg.setApplicationBounds(bounds);
        BranchGroupRoot.addChild(bg);
        //环境光
        Color3f amColor = new Color3f(0.99f, 0.976f, 0.933f);
        AmbientLight ambientLight = new AmbientLight(amColor);
        ambientLight.setInfluencingBounds(bounds);
        BranchGroupRoot.addChild(ambientLight);
        //直射光
        Color3f directionalColor = new Color3f(1.f, 1.f, 1.f);
        Vector3f vec = new Vector3f(-0.5f, -0.5f, -1f);
        DirectionalLight directionalLight = new DirectionalLight(directionalColor, vec);
        directionalLight.setInfluencingBounds(bounds);
        BranchGroupRoot.addChild(directionalLight);

        Transform3D tr = new Transform3D();
        tr.setScale(0.85);
        TransformGroup transformgroup = new TransformGroup(tr);
        transformgroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        transformgroup.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
        BranchGroupRoot.addChild(transformgroup);
        MouseRotate mouserotate = new MouseRotate();
        mouserotate.setTransformGroup(transformgroup);
        BranchGroupRoot.addChild(mouserotate);
        mouserotate.setSchedulingBounds(bounds);
        MouseZoom mousezoom = new MouseZoom();
        mousezoom.setTransformGroup(transformgroup);
        BranchGroupRoot.addChild(mousezoom);
        mousezoom.setSchedulingBounds(bounds);
        MouseTranslate mousetranslate = new MouseTranslate();
        mousetranslate.setTransformGroup(transformgroup);
        BranchGroupRoot.addChild(mousetranslate);
        mousetranslate.setSchedulingBounds(bounds);

        Material material = new Material();
        Color3f red = new Color3f(0.97f, 0f, 0f);
        material.setDiffuseColor(red);
        material.setShininess(100.0f);

        Material material1 = new Material();
        Color3f white = new Color3f(1.0f, 1.0f, 1.0f);
        material1.setDiffuseColor(white);
        material1.setShininess(100.0f);

        //头部
        float[][][] P1 = {{{-0.4f, 0.75f, 0f, 1.f}, {-0.2f, 0.75f, 0.5f, 1.f},
                {0.2f, 0.75f, 0.5f, 1.f}, {0.4f, 0.75f, 0f, 1.f}},

                {{-0.65f, 0.5f, 0f, 1.f}, {-0.2f, 0.5f, 1f, 1.f},
                        {0.2f, 0.5f, 1f, 1.f}, {0.65f, 0.5f, 0f, 1.f}},

                {{-0.65f, 0.25f, 0f, 1.f}, {-0.2f, 0.25f, 1f, 1.f},
                        {0.2f, 0.25f, 1f, 1.f}, {0.65f, 0.25f, 0f, 1.f}},

                {{-0.4f, 0f, 0f, 1.f}, {-0.2f, 0f, 0.5f, 1.f},
                        {0.2f, 0f, 0.5f, 1.f}, {0.4f, 0f, 0f, 1.f}}};
        Appearance app1 = new Appearance();
        PolygonAttributes polygona1 = new PolygonAttributes();
        polygona1.setBackFaceNormalFlip(true);
        polygona1.setCullFace(PolygonAttributes.CULL_NONE);
        app1.setPolygonAttributes(polygona1);
        ColoringAttributes color1 = new ColoringAttributes();
        color1.setColor(0.8f, 0.f, 0.f);
        app1.setColoringAttributes(color1);
        app1.setMaterial(material);

        float[][][] P2 = {{{-0.4f, 0.75f, 0f, 1.f}, {-0.2f, 0.75f, -0.5f, 1.f},
                {0.2f, 0.75f, -0.5f, 1.f}, {0.4f, 0.75f, 0f, 1.f}},

                {{-0.65f, 0.5f, 0f, 1.f}, {-0.2f, 0.5f, -1f, 1.f},
                        {0.2f, 0.5f, -1f, 1.f}, {0.65f, 0.5f, 0f, 1.f}},

                {{-0.65f, 0.25f, 0f, 1.f}, {-0.2f, 0.25f, -1f, 1.f},
                        {0.2f, 0.25f, -1f, 1.f}, {0.65f, 0.25f, 0f, 1.f}},

                {{-0.4f, 0f, 0f, 1.f}, {-0.2f, 0f, -0.5f, 1.f},
                        {0.2f, 0f, -0.5f, 1.f}, {0.4f, 0f, 0f, 1.f}}};
        Appearance app2 = new Appearance();
        PolygonAttributes polygona2 = new PolygonAttributes();
        polygona2.setBackFaceNormalFlip(true);
        polygona2.setCullFace(PolygonAttributes.CULL_NONE);
        app2.setPolygonAttributes(polygona2);
        ColoringAttributes color2 = new ColoringAttributes();
        color2.setColor(0.8f, 0.f, 0.f);
        app2.setColoringAttributes(color2);
        app2.setMaterial(material);

        float[][][] P13 = {{{-0.4f, 0.65f, 0.1f, 1.f}, {-0.2f, 0.65f, 0.6f, 1.f},
                {0.2f, 0.65f, 0.6f, 1.f}, {0.4f, 0.65f, 0.1f, 1.f}},

                {{-0.5f, 0.5f, 0.1f, 1.f}, {-0.2f, 0.5f, 1.1f, 1.f},
                        {0.2f, 0.5f, 1.1f, 1.f}, {0.5f, 0.5f, 0.1f, 1.f}},

                {{-0.5f, 0.3f, 0.1f, 1.f}, {-0.2f, 0.3f, 1.1f, 1.f},
                        {0.2f, 0.3f, 1.1f, 1.f}, {0.5f, 0.3f, 0.1f, 1.f}},

                {{-0.4f, 0.2f, 0.1f, 1.f}, {-0.2f, 0.2f, 0.6f, 1.f},
                        {0.2f, 0.2f, 0.6f, 1.f}, {0.4f, 0.2f, 0.1f, 1.f}}};
        Appearance app13 = new Appearance();
        PolygonAttributes polygona13 = new PolygonAttributes();
        polygona13.setBackFaceNormalFlip(true);
        polygona13.setCullFace(PolygonAttributes.CULL_NONE);
        app13.setPolygonAttributes(polygona13);
        ColoringAttributes color13 = new ColoringAttributes();
        color13.setColor(1.f, 1.f, 1.f);
        app13.setColoringAttributes(color13);

        //头顶
        float[][][] P4 = {{{-0.4f, 0.75f, 0f, 1.f}, {-0.2f, 0.75f, -0.5f, 1.f},
                {0.2f, 0.75f, -0.5f, 1.f}, {0.4f, 0.75f, 0f, 1.f}},

                {{-0.3f, 0.75f, 0f, 1.f}, {-0.2f, 0.95f, 0f, 1.f},
                        {0.2f, 0.95f, 0f, 1.f}, {0.3f, 0.75f, 0f, 1.f}},

                {{-0.3f, 0.75f, 0f, 1.f}, {-0.2f, 0.95f, 0f, 1.f},
                        {0.2f, 0.95f, 0f, 1.f}, {0.3f, 0.75f, 0f, 1.f}},

                {{-0.4f, 0.75f, 0f, 1.f}, {-0.2f, 0.75f, 0.5f, 1.f},
                        {0.2f, 0.75f, 0.5f, 1.f}, {0.4f, 0.75f, 0f, 1.f}}};
        Appearance app4 = new Appearance();
        PolygonAttributes polygona4 = new PolygonAttributes();
        polygona4.setBackFaceNormalFlip(true);
        polygona4.setCullFace(PolygonAttributes.CULL_NONE);
        app4.setPolygonAttributes(polygona4);
        ColoringAttributes color4 = new ColoringAttributes();
        color4.setColor(0.8f, 1.f, 1.f);
        app4.setColoringAttributes(color4);


        //身体
        float[][][] P3 = {{{-0.4f, 0f, 0f, 1.f}, {-0.2f, 0f, 0.5f, 1.f},
                {0.2f, 0f, 0.5f, 1.f}, {0.4f, 0f, 0f, 1.f}},

                {{-0.45f, -0.2f, 0f, 1.f}, {-0.2f, -0.2f, 0.5f, 1.f},
                        {0.2f, -0.2f, 0.5f, 1.f}, {0.45f, -0.2f, 0f, 1.f}},

                {{-0.45f, -0.3f, 0f, 1.f}, {-0.2f, -0.3f, 0.5f, 1.f},
                        {0.2f, -0.3f, 0.5f, 1.f}, {0.45f, -0.3f, 0f, 1.f}},

                {{-0.3f, -0.5f, 0f, 1.f}, {-0.2f, -0.5f, 0.2f, 1.f},
                        {0.2f, -0.5f, 0.2f, 1.f}, {0.3f, -0.5f, 0f, 1.f}}};
        Appearance app3 = new Appearance();
        TextureLoader loader = new TextureLoader("olympic.bmp", 2, this);
        ImageComponent2D image = loader.getImage();
        Texture2D texture = new Texture2D(Texture.BASE_LEVEL, Texture.RGBA,
                image.getWidth(), image.getHeight());
        texture.setImage(0, image);
        texture.setEnable(true);
        texture.setMagFilter(Texture.BASE_LEVEL_LINEAR);
        texture.setMinFilter(Texture.BASE_LEVEL_LINEAR);
        app3.setTexture(texture);
        PolygonAttributes polygona3 = new PolygonAttributes();
        polygona3.setBackFaceNormalFlip(true);
        polygona3.setCullFace(PolygonAttributes.CULL_NONE);
        app3.setPolygonAttributes(polygona3);
        app3.setCapability(Appearance.ALLOW_TEXGEN_WRITE);
        ColoringAttributes color3 = new ColoringAttributes();
        color3.setColor(0.8f, 0.f, 0.f);
        app3.setColoringAttributes(color3);
        app3.setMaterial(material);

        float[][][] P5 = {{{-0.4f, 0f, 0f, 1.f}, {-0.2f, 0f, -0.5f, 1.f},
                {0.2f, 0f, -0.5f, 1.f}, {0.4f, 0f, 0f, 1.f}},

                {{-0.45f, -0.2f, 0f, 1.f}, {-0.2f, -0.2f, -0.5f, 1.f},
                        {0.2f, -0.2f, -0.5f, 1.f}, {0.45f, -0.2f, 0f, 1.f}},

                {{-0.45f, -0.3f, 0f, 1.f}, {-0.2f, -0.3f, -0.5f, 1.f},
                        {0.2f, -0.3f, -0.5f, 1.f}, {0.45f, -0.3f, 0f, 1.f}},

                {{-0.3f, -0.5f, 0f, 1.f}, {-0.2f, -0.5f, -0.2f, 1.f},
                        {0.2f, -0.5f, -0.2f, 1.f}, {0.3f, -0.5f, 0f, 1.f}}};
        Appearance app5 = new Appearance();
        PolygonAttributes polygona5 = new PolygonAttributes();
        polygona5.setBackFaceNormalFlip(true);
        polygona5.setCullFace(PolygonAttributes.CULL_NONE);
        app5.setPolygonAttributes(polygona5);
        ColoringAttributes color5 = new ColoringAttributes();
        color5.setColor(0.8f, 0.f, 0.f);
        app5.setColoringAttributes(color5);
        app5.setMaterial(material);

        float[][][] P15 = {{{-0.3f, -0.5f, 0f, 1.f}, {-0.2f, -0.5f, 0.2f, 1.f},
                {0.2f, -0.5f, 0.2f, 1.f}, {0.3f, -0.5f, 0f, 1.f}},

                {{-0.3f, -0.5f, 0.1f, 1.f}, {-0.2f, -0.5f, 0.1f, 1.f},
                        {0.2f, -0.5f, 0.1f, 1.f}, {0.3f, -0.5f, 0.1f, 1.f}},

                {{-0.3f, -0.5f, -0.1f, 1.f}, {-0.2f, -0.5f, -0.1f, 1.f},
                        {0.2f, -0.5f, -0.1f, 1.f}, {0.3f, -0.5f, -0.1f, 1.f}},

                {{-0.3f, -0.5f, -0f, 1.f}, {-0.2f, -0.5f, -0.2f, 1.f},
                        {0.2f, -0.5f, -0.2f, 1.f}, {0.3f, -0.5f, -0f, 1.f}}};
        Appearance app15 = new Appearance();
        PolygonAttributes polygona15 = new PolygonAttributes();
        polygona15.setBackFaceNormalFlip(true);
        polygona15.setCullFace(PolygonAttributes.CULL_NONE);
        app15.setPolygonAttributes(polygona15);
        ColoringAttributes color15 = new ColoringAttributes();
        color15.setColor(0.8f, 0.f, 0.f);
        app15.setColoringAttributes(color15);
        app15.setMaterial(material);

        //左脚
        float[][][] P6 = {{{-0.3f, -0.49f, 0f, 1.f}, {-0.27f, -0.49f, 0.2f, 1.f},
                {0.23f, -0.49f, 0.2f, 1.f}, {-0.07f, -0.49f, 0f, 1.f}},

                {{-0.3f, -0.52f, 0f, 1.f}, {-0.27f, -0.52f, 0.2f, 1.f},
                        {-0.23f, -0.52f, 0.2f, 1.f}, {-0.07f, -0.52f, 0f, 1.f}},

                {{-0.3f, -0.55f, 0f, 1.f}, {-0.27f, -0.55f, 0.2f, 1.f},
                        {-0.23f, -0.55f, 0.2f, 1.f}, {-0.07f, -0.55f, 0f, 1.f}},

                {{-0.3f, -0.58f, 0f, 1.f}, {-0.27f, -0.58f, 0.2f, 1.f},
                        {-0.23f, -0.58f, 0.2f, 1.f}, {-0.07f, -0.58f, 0f, 1.f}}};
        Appearance app6 = new Appearance();
        PolygonAttributes polygona6 = new PolygonAttributes();
        polygona6.setBackFaceNormalFlip(true);
        polygona6.setCullFace(PolygonAttributes.CULL_NONE);
        app6.setPolygonAttributes(polygona6);
        ColoringAttributes color6 = new ColoringAttributes();
        color6.setColor(0.8f, 0.f, 0.f);
        app6.setColoringAttributes(color6);
        app6.setMaterial(material);

        float[][][] P8 = {{{-0.3f, -0.49f, 0f, 1.f}, {-0.27f, -0.49f, -0.2f, 1.f},
                {0.23f, -0.49f, -0.2f, 1.f}, {-0.07f, -0.49f, 0f, 1.f}},

                {{-0.3f, -0.52f, 0f, 1.f}, {-0.27f, -0.52f, -0.2f, 1.f},
                        {-0.23f, -0.52f, -0.2f, 1.f}, {-0.07f, -0.52f, 0f, 1.f}},

                {{-0.3f, -0.55f, 0f, 1.f}, {-0.27f, -0.55f, -0.2f, 1.f},
                        {-0.23f, -0.55f, -0.2f, 1.f}, {-0.07f, -0.55f, 0f, 1.f}},

                {{-0.3f, -0.58f, 0f, 1.f}, {-0.27f, -0.58f, -0.2f, 1.f},
                        {-0.23f, -0.58f, -0.2f, 1.f}, {-0.07f, -0.58f, 0f, 1.f}}};
        Appearance app8 = new Appearance();
        PolygonAttributes polygona8 = new PolygonAttributes();
        polygona8.setBackFaceNormalFlip(true);
        polygona8.setCullFace(PolygonAttributes.CULL_NONE);
        app8.setPolygonAttributes(polygona8);
        ColoringAttributes color8 = new ColoringAttributes();
        color8.setColor(0.8f, 0.f, 0.f);
        app8.setColoringAttributes(color8);
        app8.setMaterial(material);

        float[][][] P16 = {{{-0.3f, -0.58f, 0f, 1.f}, {-0.27f, -0.58f, 0.2f, 1.f},
                {-0.23f, -0.58f, 0.2f, 1.f}, {-0.07f, -0.58f, 0f, 1.f}},

                {{-0.3f, -0.58f, 0.1f, 1.f}, {-0.27f, -0.58f, 0.1f, 1.f},
                        {-0.23f, -0.58f, 0.1f, 1.f}, {-0.07f, -0.58f, 0.1f, 1.f}},

                {{-0.3f, -0.58f, -0.1f, 1.f}, {-0.27f, -0.58f, -0.1f, 1.f},
                        {-0.23f, -0.58f, -0.1f, 1.f}, {-0.07f, -0.58f, -0.1f, 1.f}},

                {{-0.3f, -0.58f, 0f, 1.f}, {-0.27f, -0.58f, -0.2f, 1.f},
                        {-0.23f, -0.58f, -0.2f, 1.f}, {-0.07f, -0.58f, 0f, 1.f}}};
        Appearance app16 = new Appearance();
        PolygonAttributes polygona16 = new PolygonAttributes();
        polygona16.setBackFaceNormalFlip(true);
        polygona16.setCullFace(PolygonAttributes.CULL_NONE);
        app16.setPolygonAttributes(polygona16);
        ColoringAttributes color16 = new ColoringAttributes();
        color16.setColor(0.8f, 0.f, 0.f);
        app16.setColoringAttributes(color16);
        app16.setMaterial(material);

        //右脚
        float[][][] P7 = {{{0.07f, -0.49f, 0f, 1.f}, {0.23f, -0.49f, 0.2f, 1.f},
                {0.27f, -0.49f, 0.2f, 1.f}, {0.3f, -0.49f, 0f, 1.f}},

                {{0.07f, -0.52f, 0f, 1.f}, {0.23f, -0.52f, 0.2f, 1.f},
                        {0.27f, -0.52f, 0.2f, 1.f}, {0.3f, -0.52f, 0f, 1.f}},

                {{0.07f, -0.55f, 0f, 1.f}, {0.23f, -0.55f, 0.2f, 1.f},
                        {0.27f, -0.55f, 0.2f, 1.f}, {0.3f, -0.55f, 0f, 1.f}},

                {{0.06f, -0.58f, 0f, 1.f}, {0.23f, -0.58f, 0.2f, 1.f},
                        {0.27f, -0.58f, 0.2f, 1.f}, {0.3f, -0.58f, 0f, 1.f}}};
        Appearance app7 = new Appearance();
        PolygonAttributes polygona7 = new PolygonAttributes();
        polygona7.setBackFaceNormalFlip(true);
        polygona7.setCullFace(PolygonAttributes.CULL_NONE);
        app7.setPolygonAttributes(polygona7);
        ColoringAttributes color7 = new ColoringAttributes();
        color7.setColor(0.8f, 0.f, 0.f);
        app7.setColoringAttributes(color7);
        app7.setMaterial(material);

        float[][][] P9 = {{{0.07f, -0.49f, 0f, 1.f}, {0.23f, -0.49f, -0.2f, 1.f},
                {0.27f, -0.49f, -0.2f, 1.f}, {0.3f, -0.49f, 0f, 1.f}},

                {{0.07f, -0.52f, 0f, 1.f}, {0.23f, -0.52f, -0.2f, 1.f},
                        {0.27f, -0.52f, -0.2f, 1.f}, {0.3f, -0.52f, 0f, 1.f}},

                {{0.07f, -0.55f, 0f, 1.f}, {0.23f, -0.55f, -0.2f, 1.f},
                        {0.27f, -0.55f, -0.2f, 1.f}, {0.3f, -0.55f, 0f, 1.f}},

                {{0.06f, -0.58f, 0f, 1.f}, {0.23f, -0.58f, -0.2f, 1.f},
                        {0.27f, -0.58f, -0.2f, 1.f}, {0.3f, -0.58f, 0f, 1.f}}};
        Appearance app9 = new Appearance();
        PolygonAttributes polygona9 = new PolygonAttributes();
        polygona9.setBackFaceNormalFlip(true);
        polygona9.setCullFace(PolygonAttributes.CULL_NONE);
        app9.setPolygonAttributes(polygona9);
        ColoringAttributes color9 = new ColoringAttributes();
        color9.setColor(0.8f, 0.f, 0.f);
        app9.setColoringAttributes(color9);
        app9.setMaterial(material);

        float[][][] P17 = {{{0.06f, -0.58f, 0f, 1.f}, {0.23f, -0.58f, -0.2f, 1.f},
                {0.27f, -0.58f, -0.2f, 1.f}, {0.3f, -0.58f, 0f, 1.f}},

                {{0.07f, -0.58f, -0.1f, 1.f}, {0.23f, -0.58f, -0.1f, 1.f},
                        {0.27f, -0.58f, -0.1f, 1.f}, {0.3f, -0.58f, -0.1f, 1.f}},

                {{0.07f, -0.58f, 0.1f, 1.f}, {0.23f, -0.58f, 0.1f, 1.f},
                        {0.27f, -0.58f, 0.1f, 1.f}, {0.3f, -0.58f, 0.1f, 1.f}},

                {{0.06f, -0.58f, 0f, 1.f}, {0.23f, -0.58f, 0.2f, 1.f},
                        {0.27f, -0.58f, 0.2f, 1.f}, {0.3f, -0.58f, 0f, 1.f}}};
        Appearance app17 = new Appearance();
        PolygonAttributes polygona17 = new PolygonAttributes();
        polygona17.setBackFaceNormalFlip(true);
        polygona17.setCullFace(PolygonAttributes.CULL_NONE);
        app17.setPolygonAttributes(polygona17);
        ColoringAttributes color17 = new ColoringAttributes();
        color17.setColor(0.8f, 0.f, 0.f);
        app17.setColoringAttributes(color17);
        app17.setMaterial(material);

        //右手
        float[][][] P10 = {{{0.4f, -0.08f, 0f, 1.f}, {0.41f, -0.12f, 0.08f, 1.f},
                {0.42f, -0.08f, 0.05f, 1.f}, {0.43f, -0.08f, 0f, 1.f}},

                {{0.4f, -0.23f, 0f, 1.f}, {0.45f, -0.23f, 0.12f, 1.f},
                        {0.49f, -0.23f, 0.05f, 1.f}, {0.63f, -0.23f, 0f, 1.f}},

                {{0.4f, -0.26f, 0f, 1.f}, {0.49f, -0.26f, 0.12f, 1.f},
                        {0.52f, -0.26f, 0.05f, 1.f}, {0.61f, -0.26f, 0f, 1.f}},

                {{0.494f, -0.32f, 0f, 1.f}, {0.495f, -0.32f, 0.12f, 1.f},
                        {0.496f, -0.32f, 0.05f, 1.f}, {0.497f, -0.32f, 0f, 1.f}}};
        Appearance app10 = new Appearance();
        PolygonAttributes polygona10 = new PolygonAttributes();
        polygona10.setBackFaceNormalFlip(true);
        polygona10.setCullFace(PolygonAttributes.CULL_NONE);
        app10.setPolygonAttributes(polygona10);
        ColoringAttributes color10 = new ColoringAttributes();
        color10.setColor(0.8f, 0.f, 0.f);
        app10.setColoringAttributes(color10);
        app10.setMaterial(material);

        float[][][] P11 = {{{0.4f, -0.08f, 0f, 1.f}, {0.41f, -0.12f, -0.08f, 1.f},
                {0.42f, -0.08f, -0.05f, 1.f}, {0.43f, -0.08f, 0f, 1.f}},

                {{0.4f, -0.23f, 0f, 1.f}, {0.45f, -0.23f, -0.12f, 1.f},
                        {0.49f, -0.23f, -0.05f, 1.f}, {0.63f, -0.23f, 0f, 1.f}},

                {{0.4f, -0.26f, 0f, 1.f}, {0.49f, -0.26f, -0.12f, 1.f},
                        {0.52f, -0.26f, -0.05f, 1.f}, {0.61f, -0.26f, 0f, 1.f}},

                {{0.494f, -0.32f, 0f, 1.f}, {0.495f, -0.32f, -0.12f, 1.f},
                        {0.496f, -0.32f, -0.05f, 1.f}, {0.497f, -0.32f, 0f, 1.f}}};
        Appearance app11 = new Appearance();
        PolygonAttributes polygona11 = new PolygonAttributes();
        polygona11.setBackFaceNormalFlip(true);
        polygona11.setCullFace(PolygonAttributes.CULL_NONE);
        app11.setPolygonAttributes(polygona11);
        ColoringAttributes color11 = new ColoringAttributes();
        color11.setColor(0.8f, 0.f, 0.f);
        app11.setColoringAttributes(color11);
        app11.setMaterial(material);

        //左手
        float[][][] P12 = {{{-0.55f, 0.1f, 0f, 1.f}, {-0.52f, 0.11f, 0f, 1.f},
                {-0.51f, 0.11f, 0f, 1.f}, {-0.48f, 0.1f, 0f, 1.f}},

                {{-0.6f, -0.11f, 0f, 1.f}, {-0.52f, -0.11f, 0.12f, 1.f},
                        {-0.51f, -0.11f, 0.05f, 1.f}, {-0.38f, -0.11f, 0f, 1.f}},

                {{-0.6f, -0.15f, 0f, 1.f}, {-0.52f, -0.15f, 0.12f, 1.f},
                        {-0.51f, -0.15f, 0.05f, 1.f}, {-0.4f, -0.15f, 0f, 1.f}},

                {{-0.48f, -0.26f, 0f, 1.f}, {-0.42f, -0.26f, 0.12f, 1.f},
                        {-0.41f, -0.26f, 0.05f, 1.f}, {-0.4f, -0.26f, 0f, 1.f}}};
        Appearance app12 = new Appearance();
        PolygonAttributes polygona12 = new PolygonAttributes();
        polygona12.setBackFaceNormalFlip(true);
        polygona12.setCullFace(PolygonAttributes.CULL_NONE);
        app12.setPolygonAttributes(polygona12);
        ColoringAttributes color12 = new ColoringAttributes();
        color12.setColor(0.8f, 0.f, 0.f);
        app12.setColoringAttributes(color12);
        app12.setMaterial(material);

        float[][][] P14 = {{{-0.55f, 0.1f, 0f, 1.f}, {-0.52f, 0.11f, 0f, 1.f},
                {-0.51f, 0.11f, 0f, 1.f}, {-0.48f, 0.1f, 0f, 1.f}},

                {{-0.6f, -0.11f, 0f, 1.f}, {-0.52f, -0.11f, -0.12f, 1.f},
                        {-0.51f, -0.11f, -0.05f, 1.f}, {-0.38f, -0.11f, 0f, 1.f}},

                {{-0.6f, -0.15f, 0f, 1.f}, {-0.52f, -0.15f, -0.12f, 1.f},
                        {-0.51f, -0.15f, -0.05f, 1.f}, {-0.4f, -0.15f, 0f, 1.f}},

                {{-0.48f, -0.26f, 0f, 1.f}, {-0.42f, -0.26f, -0.12f, 1.f},
                        {-0.41f, -0.26f, -0.05f, 1.f}, {-0.4f, -0.26f, 0f, 1.f}}};
        Appearance app14 = new Appearance();
        PolygonAttributes polygona14 = new PolygonAttributes();
        polygona14.setBackFaceNormalFlip(true);
        polygona14.setCullFace(PolygonAttributes.CULL_NONE);
        app14.setPolygonAttributes(polygona14);
        ColoringAttributes color14 = new ColoringAttributes();
        color14.setColor(0.8f, 0.f, 0.f);
        app14.setColoringAttributes(color14);
        app14.setMaterial(material);

        //眼睛
        float[][][] P18 = {{{-0.22f, 0.46f, 0.575f, 1.f}, {-0.22f, 0.46f, 0.7f, 1.f},
                {-0.21f, 0.46f, 0.7f, 1.f}, {-0.21f, 0.46f, 0.57f, 1.f}},

                {{-0.23f, 0.44f, 0.575f, 1.f}, {-0.22f, 0.44f, 0.7f, 1.f},
                        {-0.21f, 0.44f, 0.7f, 1.f}, {-0.19f, 0.44f, 0.575f, 1.f}},

                {{-0.23f, 0.44f, 0.575f, 1.f}, {-0.22f, 0.44f, 0.7f, 1.f},
                        {-0.21f, 0.44f, 0.7f, 1.f}, {-0.19f, 0.44f, 0.575f, 1.f}},

                {{-0.22f, 0.4f, 0.575f, 1.f}, {-0.22f, 0.4f, 0.7f, 1.f},
                        {-0.21f, 0.4f, 0.7f, 1.f}, {-0.21f, 0.4f, 0.575f, 1.f}}};
        Appearance app18 = new Appearance();
        PolygonAttributes polygona18 = new PolygonAttributes();
        polygona18.setBackFaceNormalFlip(true);
        polygona18.setCullFace(PolygonAttributes.CULL_NONE);
        app18.setPolygonAttributes(polygona18);
        ColoringAttributes color18 = new ColoringAttributes();
        color18.setColor(0.f, 0.f, 0.f);
        app18.setColoringAttributes(color18);

        float[][][] P19 = {{{0.22f, 0.46f, 0.575f, 1.f}, {0.22f, 0.46f, 0.7f, 1.f},
                {0.21f, 0.46f, 0.7f, 1.f}, {0.21f, 0.46f, 0.57f, 1.f}},

                {{0.23f, 0.44f, 0.575f, 1.f}, {0.22f, 0.44f, 0.7f, 1.f},
                        {0.21f, 0.44f, 0.7f, 1.f}, {0.19f, 0.44f, 0.575f, 1.f}},

                {{0.23f, 0.44f, 0.575f, 1.f}, {0.22f, 0.44f, 0.7f, 1.f},
                        {0.21f, 0.44f, 0.7f, 1.f}, {0.19f, 0.44f, 0.575f, 1.f}},

                {{0.22f, 0.4f, 0.575f, 1.f}, {0.22f, 0.4f, 0.7f, 1.f},
                        {0.21f, 0.4f, 0.7f, 1.f}, {0.21f, 0.4f, 0.575f, 1.f}}};
        Appearance app19 = new Appearance();
        PolygonAttributes polygona19 = new PolygonAttributes();
        polygona19.setBackFaceNormalFlip(true);
        polygona19.setCullFace(PolygonAttributes.CULL_NONE);
        app19.setPolygonAttributes(polygona19);
        ColoringAttributes color19 = new ColoringAttributes();
        color19.setColor(0.f, 0.f, 0.f);
        app19.setColoringAttributes(color19);

        //红晕
        float[][][] P20 = {{{-0.22f, 0.36f, 0.6f, 1.f}, {-0.22f, 0.36f, 0.64f, 1.f},
                {-0.21f, 0.36f, 0.66f, 1.f}, {-0.1f, 0.36f, 0.7f, 1.f}},

                {{-0.23f, 0.34f, 0.6f, 1.f}, {-0.22f, 0.34f, 0.66f, 1.f},
                        {-0.21f, 0.34f, 0.66f, 1.f}, {-0.1f, 0.34f, 0.7f, 1.f}},

                {{-0.23f, 0.34f, 0.6f, 1.f}, {-0.22f, 0.34f, 0.66f, 1.f},
                        {-0.21f, 0.34f, 0.66f, 1.f}, {-0.1f, 0.34f, 0.69f, 1.f}},

                {{-0.22f, 0.3f, 0.6f, 1.f}, {-0.22f, 0.3f, 0.66f, 1.f},
                        {-0.21f, 0.3f, 0.66f, 1.f}, {-0.1f, 0.3f, 0.6f, 1.f}}};
        Appearance app20 = new Appearance();
        PolygonAttributes polygona20 = new PolygonAttributes();
        polygona20.setBackFaceNormalFlip(true);
        polygona20.setCullFace(PolygonAttributes.CULL_NONE);
        app20.setPolygonAttributes(polygona20);
        ColoringAttributes color20 = new ColoringAttributes();
        color20.setColor(1.5f, 0.f, 0.f);
        app20.setColoringAttributes(color20);

        float[][][] P21 = {{{0.22f, 0.36f, 0.6f, 1.f}, {0.22f, 0.36f, 0.66f, 1.f},
                {0.21f, 0.36f, 0.64f, 1.f}, {0.1f, 0.36f, 0.7f, 1.f}},

                {{0.23f, 0.34f, 0.6f, 1.f}, {0.22f, 0.34f, 0.66f, 1.f},
                        {0.21f, 0.34f, 0.66f, 1.f}, {0.1f, 0.34f, 0.7f, 1.f}},

                {{0.23f, 0.34f, 0.6f, 1.f}, {0.22f, 0.34f, 0.66f, 1.f},
                        {0.21f, 0.34f, 0.66f, 1.f}, {0.1f, 0.34f, 0.69f, 1.f}},

                {{0.22f, 0.3f, 0.6f, 1.f}, {0.22f, 0.3f, 0.66f, 1.f},
                        {0.21f, 0.3f, 0.66f, 1.f}, {0.1f, 0.3f, 0.6f, 1.f}}};
        Appearance app21 = new Appearance();
        PolygonAttributes polygona21 = new PolygonAttributes();
        polygona21.setBackFaceNormalFlip(true);
        polygona21.setCullFace(PolygonAttributes.CULL_NONE);
        app21.setPolygonAttributes(polygona21);
        ColoringAttributes color21 = new ColoringAttributes();
        color21.setColor(1.5f, 0.f, 0.f);
        app21.setColoringAttributes(color21);

        Shape3D BezierSurfaceface1 = new BezierThreeOrderSurfaceface(P1, app1);
        transformgroup.addChild(BezierSurfaceface1);
        Shape3D BezierSurfaceface2 = new BezierThreeOrderSurfaceface(P2, app2);
        transformgroup.addChild(BezierSurfaceface2);
        Shape3D BezierSurfaceface3 = new BezierThreeOrderSurfaceface(P3, app3);
        transformgroup.addChild(BezierSurfaceface3);
        Shape3D BezierSurfaceface4 = new BezierThreeOrderSurfaceface(P4, app4);
        transformgroup.addChild(BezierSurfaceface4);
        Shape3D BezierSurfaceface5 = new BezierThreeOrderSurfaceface(P5, app5);
        transformgroup.addChild(BezierSurfaceface5);
        Shape3D BezierSurfaceface6 = new BezierThreeOrderSurfaceface(P6, app6);
        transformgroup.addChild(BezierSurfaceface6);
        Shape3D BezierSurfaceface7 = new BezierThreeOrderSurfaceface(P7, app7);
        transformgroup.addChild(BezierSurfaceface7);
        Shape3D BezierSurfaceface8 = new BezierThreeOrderSurfaceface(P8, app8);
        transformgroup.addChild(BezierSurfaceface8);
        Shape3D BezierSurfaceface9 = new BezierThreeOrderSurfaceface(P9, app9);
        transformgroup.addChild(BezierSurfaceface9);
        Shape3D BezierSurfaceface10 = new BezierThreeOrderSurfaceface(P10, app10);
        transformgroup.addChild(BezierSurfaceface10);
        Shape3D BezierSurfaceface11 = new BezierThreeOrderSurfaceface(P11, app11);
        transformgroup.addChild(BezierSurfaceface11);
        Shape3D BezierSurfaceface12 = new BezierThreeOrderSurfaceface(P12, app12);
        transformgroup.addChild(BezierSurfaceface12);
        Shape3D BezierSurfaceface13 = new BezierThreeOrderSurfaceface(P13, app13);
        transformgroup.addChild(BezierSurfaceface13);
        Shape3D BezierSurfaceface14 = new BezierThreeOrderSurfaceface(P14, app14);
        transformgroup.addChild(BezierSurfaceface14);
        Shape3D BezierSurfaceface15 = new BezierThreeOrderSurfaceface(P15, app15);
        transformgroup.addChild(BezierSurfaceface15);
        Shape3D BezierSurfaceface16 = new BezierThreeOrderSurfaceface(P16, app16);
        transformgroup.addChild(BezierSurfaceface16);
        Shape3D BezierSurfaceface17 = new BezierThreeOrderSurfaceface(P17, app17);
        transformgroup.addChild(BezierSurfaceface17);
        Shape3D BezierSurfaceface18 = new BezierThreeOrderSurfaceface(P18, app18);
        transformgroup.addChild(BezierSurfaceface18);
        Shape3D BezierSurfaceface19 = new BezierThreeOrderSurfaceface(P19, app19);
        transformgroup.addChild(BezierSurfaceface19);
        Shape3D BezierSurfaceface20 = new BezierThreeOrderSurfaceface(P20, app20);
        transformgroup.addChild(BezierSurfaceface20);
        Shape3D BezierSurfaceface21 = new BezierThreeOrderSurfaceface(P21, app21);
        transformgroup.addChild(BezierSurfaceface21);
        BranchGroupRoot.compile();
        return BranchGroupRoot;
    }

    public ShueyRhon() throws IOException {
        setLayout(new BorderLayout());
        GraphicsConfiguration gc = SimpleUniverse.getPreferredConfiguration();
        Canvas3D c = new Canvas3D(gc);
        add("Center", c);
        BranchGroup BranchGroupScene = createBranchGroupSceneGraph();
        SimpleUniverse u = new SimpleUniverse(c);
        u.getViewingPlatform().setNominalViewingTransform();
        u.addBranchGraph(BranchGroupScene);
    }

    public static void main(String[] args) throws IOException {
        new MainFrame(new ShueyRhon(), 400, 400);
    }
}

class BezierThreeOrderSurfaceface extends Shape3D {
    public BezierThreeOrderSurfaceface(float[][][] P, Appearance app) {
        int i, j, k;
        int n0;//定义对参数u、v在[0，1]区间的等分点数
        float division;//参数u在[0，1]区间的等分线段长度
        n0 = 50;
        division = 1.f / n0;
//分别定义存放控制顶点x、y、z坐标与第四维坐标的数组
        float[][] PX = new float[4][4];
        float[][] PY = new float[4][4];
        float[][] PZ = new float[4][4];
        float[][] P4 = new float[4][4];
//定义系数矩阵及其转置矩阵
        float[][] M1 = {{1.f, 0.f, 0.f, 0.f},
                {-3.f, 3.f, 0.f, 0.f},
                {3.f, -6.f, 3.f, 0.f},
                {-1.f, 3.f, -3.f, 1.f}};
        float[][] M2 = {{1.f, -3.f, 3.f, -1.f},
                {0.f, 3.f, -6.f, 3.f},
                {0.f, 0.f, 3.f, -3.f},
                {0.f, 0.f, 0.f, 1.f}};
//定义Bezier曲面的u、v参数分割点坐标数组
        float[][][] UV = new float[n0 + 1][n0 + 1][2];
//定义U、V矩阵数组
        float[][] UU = new float[1][4];
        float[][] VV = new float[4][1];
//定义存放曲面上点的坐标的数组
        float[][][] SurfaceXYZ = new float[n0 + 1][n0 + 1][4];
        for (i = 0; i < n0 + 1; i++)
            for (j = 0; j < n0 + 1; j++) {
                UV[i][j][0] = i * division;
                UV[i][j][1] = j * division;
            }
        for (i = 0; i < 4; i++)
            for (j = 0; j < 4; j++) {
                PX[i][j] = P[i][j][0];
                PY[i][j] = P[i][j][1];
                PZ[i][j] = P[i][j][2];
                P4[i][j] = P[i][j][3];
            }
//计算曲面上点的坐标值
        for (i = 0; i < n0 + 1; i++)
            for (j = 0; j < n0 + 1; j++) {
                UU[0][0] = 1.f;
                UU[0][1] = UV[i][j][0];
                UU[0][2] = UV[i][j][0] * UV[i][j][0];
                UU[0][3] = UV[i][j][0] * UV[i][j][0] * UV[i][j][0];
                VV[0][0] = 1.f;
                VV[1][0] = UV[i][j][1];
                VV[2][0] = UV[i][j][1] * UV[i][j][1];
                VV[3][0] = UV[i][j][1] * UV[i][j][1] * UV[i][j][1];
                //计算一点的x坐标
                matrixm g0 = new matrixm(1, 4, 4, UU, M1);
                matrixm g1 = new matrixm(1, 4, 4, g0.CC, PX);
                matrixm g2 = new matrixm(1, 4, 4, g1.CC, M2);
                matrixm g3 = new matrixm(1, 4, 1, g2.CC, VV);
                SurfaceXYZ[i][j][0] = g3.CC[0][0];
                //计算一点的y坐标
                matrixm g4 = new matrixm(1, 4, 4, UU, M1);
                matrixm g5 = new matrixm(1, 4, 4, g4.CC, PY);
                matrixm g6 = new matrixm(1, 4, 4, g5.CC, M2);
                matrixm g7 = new matrixm(1, 4, 1, g6.CC, VV);
                SurfaceXYZ[i][j][1] = g7.CC[0][0];
                //计算一点的z坐标
                matrixm g8 = new matrixm(1, 4, 4, UU, M1);
                matrixm g9 = new matrixm(1, 4, 4, g8.CC, PZ);
                matrixm g10 = new matrixm(1, 4, 4, g9.CC, M2);
                matrixm g11 = new matrixm(1, 4, 1, g10.CC, VV);
                SurfaceXYZ[i][j][2] = g11.CC[0][0];
                //计算一点的第4维坐标
                matrixm g12 = new matrixm(1, 4, 4, UU, M1);
                matrixm g13 = new matrixm(1, 4, 4, g12.CC, P4);
                matrixm g14 = new matrixm(1, 4, 4, g13.CC, M2);
                matrixm g15 = new matrixm(1, 4, 1, g14.CC, VV);
                SurfaceXYZ[i][j][3] = g15.CC[0][0];
                //将齐次坐标转换为三维坐标系坐标，如果第4维为1，则不用除第4维
                SurfaceXYZ[i][j][0] = SurfaceXYZ[i][j][0] / SurfaceXYZ[i][j][3];
                SurfaceXYZ[i][j][1] = SurfaceXYZ[i][j][1] / SurfaceXYZ[i][j][3];
                SurfaceXYZ[i][j][2] = SurfaceXYZ[i][j][2] / SurfaceXYZ[i][j][3];
            }
        QuadArray BezierQuadsurfaceface = new QuadArray(n0 * n0 * 4,
                GeometryArray.COORDINATES | GeometryArray.NORMALS | GeometryArray.TEXTURE_COORDINATE_2);
        int c = 0;//以顶点数累加的方式设置顶点的序号
        for (i = 0; i < n0; i++) {
            for (j = 0; j < n0; j++) {//设置一个平面上的4个点
                Point3f A = new Point3f(SurfaceXYZ[i][j][0], SurfaceXYZ[i][j][1],
                        SurfaceXYZ[i][j][2]);
                Point3f B = new Point3f(SurfaceXYZ[i][j + 1][0], SurfaceXYZ[i][j + 1][1],
                        SurfaceXYZ[i][j + 1][2]);
                Point3f C = new Point3f(SurfaceXYZ[i + 1][j + 1][0], SurfaceXYZ[i + 1][j + 1][1],
                        SurfaceXYZ[i + 1][j + 1][2]);
                Point3f D = new Point3f(SurfaceXYZ[i + 1][j][0], SurfaceXYZ[i + 1][j][1],
                        SurfaceXYZ[i + 1][j][2]);
//计算由四个点形成的平面的法向量
                Vector3f a = new Vector3f(A.x - B.x, A.y - B.y, A.z - B.z);
                Vector3f b = new Vector3f(C.x - B.x, C.y - B.y, C.z - B.z);
                Vector3f n = new Vector3f();
                n.cross(b, a);
                n.normalize();
//设置点的序号
                BezierQuadsurfaceface.setCoordinate(c, A);
                BezierQuadsurfaceface.setCoordinate(c + 1, B);
                BezierQuadsurfaceface.setCoordinate(c + 2, C);
                BezierQuadsurfaceface.setCoordinate(c + 3, D);
//设置点的法向量
                BezierQuadsurfaceface.setNormal(c, n);
                BezierQuadsurfaceface.setNormal(c + 1, n);
                BezierQuadsurfaceface.setNormal(c + 2, n);
                BezierQuadsurfaceface.setNormal(c + 3, n);


                //设置纹理坐标
                TexCoord2f texCoords = new TexCoord2f(i * 1.f / n0, 1.f - j * 1.f / n0);
                BezierQuadsurfaceface.setTextureCoordinate(0, c, texCoords);
                texCoords = new TexCoord2f((i + 1) * 1.f / n0, 1.f - j * 1.f / n0);
                BezierQuadsurfaceface.setTextureCoordinate(0, c + 1, texCoords);
                texCoords = new TexCoord2f((i + 1) * 1.f / n0, 1.f - (j + 1) * 1.f / n0);
                BezierQuadsurfaceface.setTextureCoordinate(0, c + 2, texCoords);
                texCoords = new TexCoord2f(i * 1.f / n0, 1.f - (j + 1) * 1.f / n0);
                BezierQuadsurfaceface.setTextureCoordinate(0, c + 3, texCoords);
                c = c + 4;
            }
        }
        this.addGeometry(BezierQuadsurfaceface);
        this.setAppearance(app);
    }
}

class BezierSurfaceControlPoints extends Shape3D {
    public BezierSurfaceControlPoints(float[][][] P, Appearance app) {
        int i, j, k;
        QuadArray BeziersurfacecontrolPointsNet = new QuadArray(3 * 3 * 4,
                GeometryArray.COORDINATES | GeometryArray.NORMALS);
        int c = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                Point3f A = new Point3f(P[i][j][0], P[i][j][1], P[i][j][2]);
                Point3f B = new Point3f(P[i][j + 1][0], P[i][j + 1][1], P[i][j + 1][2]);
                Point3f C = new Point3f(P[i + 1][j + 1][0], P[i + 1][j + 1][1], P[i + 1][j + 1][2]);
                Point3f D = new Point3f(P[i + 1][j][0], P[i + 1][j][1], P[i + 1][j][2]);
                Vector3f a = new Vector3f(A.x - B.x, A.y - B.y, A.z - B.z);
                Vector3f b = new Vector3f(C.x - B.x, C.y - B.y, C.z - B.z);
                Vector3f n = new Vector3f();
                n.cross(b, a);
                n.normalize();
                BeziersurfacecontrolPointsNet.setCoordinate(c, A);
                BeziersurfacecontrolPointsNet.setCoordinate(c + 1, B);
                BeziersurfacecontrolPointsNet.setCoordinate(c + 2, C);
                BeziersurfacecontrolPointsNet.setCoordinate(c + 3, D);
                BeziersurfacecontrolPointsNet.setNormal(c, n);
                BeziersurfacecontrolPointsNet.setNormal(c + 1, n);
                BeziersurfacecontrolPointsNet.setNormal(c + 2, n);
                BeziersurfacecontrolPointsNet.setNormal(c + 3, n);

                c = c + 4;
            }
        }
        this.addGeometry(BeziersurfacecontrolPointsNet);
        this.setAppearance(app);
    }
}

class matrixm {
    public float CC[][] = new float[4][4];
    int ll, mm, kk;

    public matrixm(int mmm, int kkk, int nnn, float a[][], float b[][]) {
        for (ll = 0; ll < mmm; ll++)
            for (mm = 0; mm < nnn; mm++) {
                CC[ll][mm] = 0.f;
            }
        for (ll = 0; ll < mmm; ll++)
            for (mm = 0; mm < nnn; mm++) {
                for (kk = 0; kk < kkk; kk++) CC[ll][mm] = CC[ll][mm] + a[ll][kk] * b[kk][mm];
            }
    }
}
