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
public interface ItemVisitor {
     // Une méthode pour chaque sous-classe de Modem
	void visit(Book book);
	void visit(CD cd);
}
