package com.romanm.pis.servlet.command;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Interface for Command pattern implementation
 */
public interface Command {
    void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
    void post(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}