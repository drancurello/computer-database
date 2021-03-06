package com.excilys.computerDatabase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.excilys.computerDatabase.page.Page;

public class PageTest {
	
	@Test
	public void testPage()
	{
		Page page = new Page(1,50);
		
		assertEquals(50,page.getNbEntriesByPage());
		
		assertEquals(1,page.getPageNumber());
		
		page.previousPage();
		assertEquals(1,page.getPageNumber());
		
		page.nextPage();
		assertEquals(2,page.getPageNumber());
		
		page.previousPage();
		assertEquals(1,page.getPageNumber());
		
		page.setPageNumber(page.getNbPage());
		
		int nbPage = page.getNbComputers()/page.getNbEntriesByPage();
		
		assertEquals(nbPage,page.getPageNumber());
		
		page.nextPage();
		assertEquals(nbPage+1,page.getPageNumber());
		
		page.nextPage();
		assertEquals(nbPage+1,page.getPageNumber());
		
		
		
	}

}
