/*
 * Serial Port library Copyright (c) 1996-2003 Solutions Consulting,
 * All Rights Reserved.
*/

/*
 * The MIT License
 *
 * Copyright 2019 Lou Nigra.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ThreadedSerial;


/**
 *
 * @author Lou Nigra
 * 
 * Derived from Concurrency Example by http://www.baeldung.com/java-wait-notify
 * Original code at:
 * https://github.com/eugenp/tutorials/tree/master/core-java-concurrency-basic
 * Under MIT License
 */
public class ThreadedSerialTest {
    
    public static void main(String[] args) {
        String packets[] = {
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
            };
        Data data = new Data();
        
        for (String packet : packets) {
            data.send(packet);
            String response = data.receive();
            System.out.println( response );
 
        }
    }
}
