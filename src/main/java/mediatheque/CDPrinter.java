/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mediatheque;

/**
 *
 * @author emmasalvan
 */
public class CDPrinter implements ItemVisitor {
	public CDPrinter() {
	}

	public void visit(Book book) {
                System.out.println(book);
	}

	public void visit(CD cd) {
		System.out.println(cd);
	}
}
