package org.omg.CosNaming;


/**
* org/omg/CosNaming/BindingIteratorHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, April 10, 2015 11:21:18 AM PDT
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <tt>list</tt>
   * method on the <tt>NamingContext</tt>. 
   * @see org.omg.CosNaming.NamingContext#list
   */
abstract public class BindingIteratorHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/BindingIterator:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CosNaming.BindingIterator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CosNaming.BindingIterator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.CosNaming.BindingIteratorHelper.id (), "BindingIterator");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CosNaming.BindingIterator read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_BindingIteratorStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CosNaming.BindingIterator value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.omg.CosNaming.BindingIterator narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CosNaming.BindingIterator)
      return (org.omg.CosNaming.BindingIterator)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CosNaming._BindingIteratorStub stub = new org.omg.CosNaming._BindingIteratorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.CosNaming.BindingIterator unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CosNaming.BindingIterator)
      return (org.omg.CosNaming.BindingIterator)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CosNaming._BindingIteratorStub stub = new org.omg.CosNaming._BindingIteratorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
