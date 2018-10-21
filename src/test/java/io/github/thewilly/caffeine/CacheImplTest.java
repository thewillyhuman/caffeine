package io.github.thewilly.caffeine;
/* 
 * MIT License
 * 
 * Copyright (c) 2018 Guillermo Facundo Colunga
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * The Class LibraryTest.
 *
 * @author Guillermo Facundo Colunga
 * @version 201806081225
 */
public class CacheImplTest {
	
	private CacheImpl cache = new CacheImpl();
	
	
	@Test
	public void test() {
		cache.save( "sadf", "Hola me llamo guillermo", 2000, () -> { System.err.println( "Goodbie" ); } );
		
		assertEquals( "Hola me llamo guillermo", cache.get( "sadf" ) );
		
		while(cache.get( "sadf" ) != null) {
			System.out.println("Waiting...");
		}
		
		assertEquals( null, cache.get( "sadf" ) );
	} 
}
