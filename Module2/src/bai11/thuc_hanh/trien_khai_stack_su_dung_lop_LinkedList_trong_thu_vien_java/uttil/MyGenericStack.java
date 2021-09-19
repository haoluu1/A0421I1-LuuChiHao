package bai11.thuc_hanh.trien_khai_stack_su_dung_lop_LinkedList_trong_thu_vien_java.uttil;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T>
{
    private LinkedList<T> stack;

    public MyGenericStack()
    {
        stack = new LinkedList();
    }

    public void push(T element)
    {
        stack.addFirst(element);
    }

    public T pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size()
    {
        return stack.size();
    }

    public boolean isEmpty()
    {
        if (stack.size() == 0)
        {
            return true;
        }
        return false;
    }
}
