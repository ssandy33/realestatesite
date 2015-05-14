package com.gs.datatypes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratableList<T>  implements Iterator<T>, Iterable<T> {
	protected ArrayList<T> m_oVect = new ArrayList<T>();
	private Iterator<T> m_oIterator = m_oVect.iterator();
	
	// Iterator implementation:
	// These methods all delegate control to the contained Iterator, m_oIterator:
	public boolean hasNext() {
		return m_oIterator.hasNext();
	}
	public T next() {
		return m_oIterator.next();
	}
	public void remove() {
		m_oIterator.remove();
	}
	
	// Iterable interface:
	public Iterator<T> iterator() {
		// Ideally, we should call resetIterator(), and return m_oIterator (or return this).
		// This would allow the caller to call remove() to remove the current object, for example:
		//          IteratableList<X> list = ...
		//          for (X x : list) {
		//             if (shouldRemove(x))
		//                list.remove();
		//          }
		// Instead you must do this:
		//          IteratableList<X> list = ...
		//          Iterator<X> it = list.iterator();
		//          while (it.hasNext) {
		//             X x = it.next();
		//             if (shouldRemove(x))
		//                it.remove();
		//          }
		// The problem is that when we call resetIterator() in this call, it disrupts other iterators,
		// and we end up with empty category results from this URL (and probably other issues too):
		// http://localhost/cruises/cruisedetail.jsp?cobrand=35385&pid=2&langrecno=1&sessionid=7EEDAB344F1B943F88C0380054807D31&jsessionid=7EEDAB344F1B943F88C0380054807D31&ur=6010&customerid=RVV93009XKA&top=null&pts=2500&recno=32296394&isgalileo=true&clr=4&aircode=PHX&aircity=Phoenix&hasair=false&rctype=1&certnumber=cn49857DKZ3&authcode=ac49857DKZ3
		return m_oVect.iterator();
	}
	
	public void resetIterator()
	{
		m_oIterator = m_oVect.iterator();
	}
	
	public int size()
	{
		return m_oVect.size();
	}
	@Deprecated // should call 'size()' instead
	public int getSize()
	{
		return m_oVect.size();
	}
	@Deprecated // should call 'size()' instead
	public int getCount()
	{
		return m_oVect.size();
	}
	
	public boolean isEmpty() {
		return m_oVect.isEmpty();
	}
	
	
	public boolean add(T oNewObj)
	{
		boolean bWasAdded = m_oVect.add(oNewObj);
		resetIterator();
		return bWasAdded;
	}
	
	public boolean addAll(Collection<? extends T> oNewCollection)
	{
		boolean bWasAdded = m_oVect.addAll(oNewCollection);
		resetIterator();
		return bWasAdded;
	}

	public void remove(T oObjToRemove)
	{
		m_oVect.remove(oObjToRemove);
	}

	public void clear()
	{
		m_oVect.clear();
		resetIterator();
	}
	
	public T getFirst() {
		return getItem(0);
	}
	public T getLast() {
		return getItem(m_oVect.size()-1);
	}
	public T getItem(int index) {
		if (m_oVect.size() > index)
			return m_oVect.get(index);
		return null;
	}
}
