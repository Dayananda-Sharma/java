package com.xworkz.compileTime.event;

import org.ietf.jgss.GSSException;

import javax.management.*;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.management.modelmbean.XMLParseException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathException;
import java.awt.*;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.print.PrinterException;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.NotActiveException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.LambdaConversionException;
import java.net.URISyntaxException;
import java.rmi.AlreadyBoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.server.ServerNotActiveException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

public class Problem {
 public void compileTimeException() throws NotActiveException{
     System.out.println("ActivationException");
     throw new NotActiveException();
 }
 public void compileTimeException1() throws AlreadyBoundException{
     System.out.println("AlreadyBoundException");
     throw new AlreadyBoundException();
 }
 public void compileTimeException2() throws AWTException{
     System.out.println("AWTException");
     throw new AWTException("");
 }
 public void compileTimeException3() throws BackingStoreException{
     System.out.println("BackingStoreException");
     throw  new BackingStoreException("");
 }
 public void compileTimeException4() throws BadAttributeValueExpException{
     System.out.println("BadAttributeValueExpException");
     throw  new BadAttributeValueExpException("");
 }
 public void compileTimeException5() throws BadBinaryOpValueExpException{
     System.out.println("BadBinaryOpValueExpException");
     throw new BadBinaryOpValueExpException(null);
 }
 public void compileTimeException6() throws BadLocationException{
     System.out.println("BadLocationException");
     throw new BadLocationException("s",1);
 }
    public void compileTimeException7() throws BadStringOperationException {
        System.out.println("BadStringOperationException");
        throw new BadStringOperationException("s");
    }
    public void compileTimeException8() throws BrokenBarrierException {
        System.out.println("BrokenBarrierException");
        throw new BrokenBarrierException();
    }
    public void compileTimeException9() throws CertificateException {
        System.out.println("CertificateException");
        throw new CertificateException("s");
    }
    public void compileTimeException10() throws CloneNotSupportedException{
        System.out.println("BadLocationException");
        throw new CloneNotSupportedException();
    }
    public void compileTimeException11() throws DataFormatException {
        System.out.println("DataFormatException");
        throw new DataFormatException();
    }
      public void compileTimeException12() throws DatatypeConfigurationException {
        System.out.println("DatatypeConfigurationException");
        throw new DatatypeConfigurationException("s");
    }
    public void compileTimeException13() throws DestroyFailedException {
        System.out.println("BadLocationException");
        throw new DestroyFailedException();
    }
    public void compileTimeException14() throws ExecutionException {
        System.out.println("ExecutionException");
        throw new ExecutionException(null);
    }
    public void compileTimeException15() throws ExpandVetoException {
        System.out.println("ExpandVetoException");
        throw new ExpandVetoException(null);
    }
      public void compileTimeException16() throws FontFormatException{
        System.out.println("FontFormatException");
        throw new FontFormatException("s");
    }
    public void compileTimeException17() throws GeneralSecurityException {
        System.out.println("BadLocationException");
        throw new GeneralSecurityException("s");
    }
    public void compileTimeException18() throws GSSException {
        System.out.println("BadLocationException");
        throw new GSSException(1);
    }
    public void compileTimeException19() throws IllegalClassFormatException {
        System.out.println("IllegalClassFormatException");
        throw new IllegalClassFormatException();
    }
    public void compileTimeException20() throws IntrospectionException {
        System.out.println("IntrospectionException");
        throw new IntrospectionException();
    }
    public void compileTimeException21() throws InvalidMidiDataException {
        throw new InvalidMidiDataException();
    }

    public void compileTimeException22() throws InvalidPreferencesFormatException {
        throw new InvalidPreferencesFormatException("", null);
    }

    public void compileTimeException23() throws InvalidTargetObjectTypeException {
        throw new InvalidTargetObjectTypeException("");
    }

    public void compileTimeException24() throws IOException {
        throw new IOException();
    }

    public void compileTimeException25() throws JMException {
        throw new JMException();
    }

    public void compileTimeException26() throws KeySelectorException {
        throw new KeySelectorException();
    }

    public void compileTimeException27() throws LambdaConversionException {
        throw new LambdaConversionException();
    }

    public void compileTimeException28() throws LineUnavailableException {
        throw new LineUnavailableException();
    }

    public void compileTimeException29() throws MarshalException {
        throw new MarshalException("");
    }

    public void compileTimeException30() throws MidiUnavailableException {
        throw new MidiUnavailableException();
    }

    public void compileTimeException31() throws MimeTypeParseException {
        throw new MimeTypeParseException();
    }

    public void compileTimeException32() throws NamingException {
        throw new NamingException();
    }

    public void compileTimeException33() throws NoninvertibleTransformException {
        throw new NoninvertibleTransformException("");
    }

    public void compileTimeException34() throws NotBoundException {
        throw new NotBoundException();
    }

    public void compileTimeException35() throws ParseException {
        throw new ParseException("", 0);
    }

    public void compileTimeException36() throws ParserConfigurationException {
        throw new ParserConfigurationException();
    }

    public void compileTimeException37() throws PrinterException {
        throw new PrinterException();
    }

    public void compileTimeException38() throws PrintException {
        throw new PrintException();
    }

    public void compileTimeException39() throws PrivilegedActionException {
        throw new PrivilegedActionException(new Exception());
    }

    public void compileTimeException40() throws PropertyVetoException {
        throw new PropertyVetoException("", null);
    }

    public void compileTimeException41() throws ReflectiveOperationException {
        throw new ReflectiveOperationException();
    }

    public void compileTimeException42() throws RefreshFailedException {
        throw new RefreshFailedException();
    }

    public void compileTimeException43() throws ScriptException {
        throw new ScriptException("");
    }

    public void compileTimeException44() throws ServerNotActiveException {
        throw new ServerNotActiveException();
    }

    public void compileTimeException45() throws SQLException {
        throw new SQLException();
    }

    public void compileTimeException46() throws TimeoutException {
        throw new TimeoutException();
    }

    public void compileTimeException47() throws TooManyListenersException {
        throw new TooManyListenersException();
    }

    public void compileTimeException48() throws TransformerException {
        throw new TransformerException("");
    }

    public void compileTimeException49() throws UnmodifiableClassException {
        throw new UnmodifiableClassException();
    }

    public void compileTimeException50() throws UnsupportedAudioFileException {
        throw new UnsupportedAudioFileException();
    }

    public void compileTimeException51() throws UnsupportedCallbackException {
        throw new UnsupportedCallbackException(null);
    }

    public void compileTimeException52() throws UnsupportedFlavorException {
        throw new UnsupportedFlavorException(null);
    }

    public void compileTimeException53() throws UnsupportedLookAndFeelException {
        throw new UnsupportedLookAndFeelException("");
    }

    public void compileTimeException54() throws URIReferenceException {
        throw new URIReferenceException("", null);
    }

    public void compileTimeException55() throws URISyntaxException {
        throw new URISyntaxException("", "");
    }



    public void compileTimeException56() throws XMLParseException {
        throw new XMLParseException(null, null);
    }

    public void compileTimeException57() throws XMLSignatureException {
        throw new XMLSignatureException();
    }

    public void compileTimeException58() throws XMLStreamException {
        throw new XMLStreamException();
    }

    public void compileTimeException59() throws XPathException {
        throw new XPathException("");
    }
}
