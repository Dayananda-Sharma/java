package com.xworkz.exception.internal;

import javax.transaction.xa.XAException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;

public class InbuiltException {
    public void sqlException() throws SQLException{
        throw new SQLException();
    }
    public void filealreadyExistsException() throws FileAlreadyExistsException {
        throw new FileAlreadyExistsException("xowkz");
    }
    public void aclNotFoundException() throws AclNotFoundException{
        throw new AclNotFoundException();
    }
    public void fileSystemException() throws FileSystemException{
        throw new FileSystemException("kk");
    }
    public void runTimeException() throws RuntimeException{
        throw new RuntimeException();
    }
    public void xaException() throws XAException{
        throw new XAException();
    }
    public void NumberFormatException() throws NumberFormatException{
        throw new NumberFormatException();
    }
    public void nullPointerException() throws NullPointerException{
        throw new NullPointerException();
    }
    public void arrayIndexOutException() throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException();
    }
    public void arithmeticException() throws ArithmeticException{
        throw new ArithmeticException();
    }
}
