/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.catalogo;

import java.io.*;
import java.awt.image.BufferedImage;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageDecoder;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
/**
 *
 * @author crist
 */
public class JPGManager {
    static public void encodeJPG(OutputStream out, byte [] image) throws IOException{
        int BUFFER = image.length;
        BufferedImage bImage;
        JPEGImageEncoder encoder;
        try (InputStream fs = new ByteArrayInputStream(image)) {
            JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(fs);
            bImage = decoder.decodeAsBufferedImage();
            encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(bImage);
        }
        encoder = null;
        bImage = null;
    }
}
