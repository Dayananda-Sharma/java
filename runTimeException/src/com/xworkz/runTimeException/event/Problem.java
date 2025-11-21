package com.xworkz.runTimeException.event;

import org.w3c.dom.DOMError;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;
import org.xml.sax.SAXException;

import javax.lang.model.type.MirroredTypeException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.XMLParseException;
import javax.print.attribute.UnmodifiableSetException;
import javax.script.ScriptException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.annotation.Target;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URISyntaxException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.server.ServerNotActiveException;
import java.security.ProviderException;
import java.sql.SQLException;
import java.time.DateTimeException;
import java.util.*;
import java.util.concurrent.CompletionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;

import static javax.swing.text.html.HTML.Tag.S;

public class Problem{
    public void arithmeticException(){
        System.out.println("this is arithmeticException");
        throw new ArithmeticException();
    }
    public void arryStroeException(){
        System.out.println("arryStroeException");
        throw  new ArrayStoreException();
    }
    public  void bufferOverflowException(){
        System.out.println("bufferOverflowException");
        throw new BufferOverflowException();
    }
    public  void exception0() {
        System.out.println("bufferOverflowException");
        throw new CannotRedoException();

    }
    public  void exception1() {
        System.out.println("bufferOverflowException");
        throw new CannotUndoException();
    }
    public  void exception2() {
        System.out.println("bufferOverflowException");
        throw new ClassCastException();
    }
    public  void exception3() {
        System.out.println("bufferOverflowException");
        throw new RasterFormatException("s");
    }
    public  void exception4() {
        System.out.println("bufferOverflowException");
        throw new RejectedExecutionException();
    }
    public  void exception5() {
        System.out.println("bufferOverflowException");
        throw new SecurityException();
    }
    public  void exception6() {
        System.out.println("bufferOverflowException");
        throw new EmptyStackException();
    }
    public  void exception7() {
        System.out.println("bufferOverflowException");
        throw new EmptyStackException();
    }
    public  void exception8() {
        System.out.println("bufferOverflowException");
        throw new SecurityException();
    }
    public  void exception9() {
        System.out.println("bufferOverflowException");
        throw new FileSystemAlreadyExistsException();
    }
    public  void exception10() {
        System.out.println("bufferOverflowException");
        throw new FileSystemNotFoundException();
    }
    public  void exception11() {
        System.out.println("bufferOverflowException");
        throw new IllegalArgumentException();
    }
    public  void exception12() {
        System.out.println("bufferOverflowException");
        throw new IllegalMonitorStateException();
    }
    public  void exception13() {
        System.out.println("bufferOverflowException");
        throw new IllegalPathStateException();
    }
    public  void exception14() {
        System.out.println("bufferOverflowException");
        throw new IllegalStateException();
    }
    public  void exception15() {
        System.out.println("bufferOverflowException");
        throw new IllformedLocaleException();
    }
    public  void exception16() {
        System.out.println("bufferOverflowException");
        throw new IndexOutOfBoundsException();
    }
    public  void exception17() {
        System.out.println("bufferOverflowException");
        throw new MalformedParametersException();
    }
    public  void exception18() {
        System.out.println("bufferOverflowException");
        throw new IndexOutOfBoundsException();
    }
    public  void exception19() {
        System.out.println("bufferOverflowException");
        throw new JMRuntimeException();
    }
    public  void exception20() {
        System.out.println("bufferOverflowException");
        throw new MalformedParameterizedTypeException();
    }
    public  void exception21() {
        System.out.println("bufferOverflowException");
        throw new MalformedParametersException();
    }
    public  void exception22() {
        System.out.println("bufferOverflowException");
        throw new NoSuchElementException();
    }
    public  void exception23() {
        System.out.println("bufferOverflowException");
        throw new NegativeArraySizeException();
    }
    public  void exception24() {
        System.out.println("bufferOverflowException");
        throw new NullPointerException();
    }
    public  void exception25() {
        System.out.println("bufferOverflowException");
        throw new ProviderException();
    }
    public  void exception26() {
        System.out.println("bufferOverflowException");
        throw new ProviderNotFoundException();
    }
    public void exception27(){
        System.out.println("Uncheck Exception");
        throw new RasterFormatException("");
    }
    public void exception28(){
        System.out.println("Uncheck Exception");
        throw new RejectedExecutionException();
    }
    public void exception29(){
        System.out.println("Uncheck Exception");
        throw new SecurityException();
    }

    public void exception30(){
        System.out.println("Uncheck Exception");
        throw new TypeNotPresentException("", null);
    }
    public void exception31(){
        System.out.println("Uncheck Exception");
        throw new UncheckedIOException(new IOException());
    }
    public void exception32(){
        System.out.println("Uncheck Exception");
        throw new UndeclaredThrowableException(null);
    }

    public void exception33(){
        System.out.println("Uncheck Exception");
        throw new UnmodifiableSetException();
    }
    public void exception34(){
        System.out.println("Uncheck Exception");
        throw new UnsupportedOperationException();
    }

    public void exception35(){
        System.out.println("Uncheck Exception");
        throw new WrongMethodTypeException();
    }

}




