/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.catalogo;

/**
 *
 * @author crist
 */
public class JPGManager {
    static public void encodeJPG(OutputStream out, byte [] image) throws IOException{
        int BUFFER = image.length;
        InputStream fs = new ByteArrayInputStream(image);
        JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(fs);
        BufferedImage bImage = decoder.decodeAsBufferedImage();
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        encoder.encode(bImage);
        fs.close();
        fs = null;
        encoder = null;
        bImage = null;
    }
}
