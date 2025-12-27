package com.xworkz.exception.external;

import com.xworkz.exception.internal.InbuiltException;


import javax.transaction.xa.XAException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;

public class InbuiltExceptionRunner {
    public static void main(String[] args) throws SQLException, FileAlreadyExistsException,
            AclNotFoundException,
            FileSystemException,RuntimeException,NumberFormatException,
            XAException,NullPointerException,ArrayIndexOutOfBoundsException,
            ArithmeticException {


        InbuiltException obj=new InbuiltException();
        obj.sqlException();
        obj.filealreadyExistsException();
        obj.aclNotFoundException();
        obj.fileSystemException();
        obj.runTimeException();
        obj.xaException();
        obj.NumberFormatException();
        obj.nullPointerException();
        obj.arrayIndexOutException();
        obj.arithmeticException();
    }
}
