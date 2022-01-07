/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.acme.kafka.quarkus;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Book extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1778617851535180545L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Book\",\"namespace\":\"org.acme.kafka.quarkus\",\"fields\":[{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"editor\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"year\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Book> ENCODER =
      new BinaryMessageEncoder<Book>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Book> DECODER =
      new BinaryMessageDecoder<Book>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Book> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Book> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Book> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Book>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Book to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Book from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Book instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Book fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String title;
  private java.lang.String editor;
  private int year;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Book() {}

  /**
   * All-args constructor.
   * @param title The new value for title
   * @param editor The new value for editor
   * @param year The new value for year
   */
  public Book(java.lang.String title, java.lang.String editor, java.lang.Integer year) {
    this.title = title;
    this.editor = editor;
    this.year = year;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return title;
    case 1: return editor;
    case 2: return year;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: title = value$ != null ? value$.toString() : null; break;
    case 1: editor = value$ != null ? value$.toString() : null; break;
    case 2: year = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }


  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'editor' field.
   * @return The value of the 'editor' field.
   */
  public java.lang.String getEditor() {
    return editor;
  }


  /**
   * Sets the value of the 'editor' field.
   * @param value the value to set.
   */
  public void setEditor(java.lang.String value) {
    this.editor = value;
  }

  /**
   * Gets the value of the 'year' field.
   * @return The value of the 'year' field.
   */
  public int getYear() {
    return year;
  }


  /**
   * Sets the value of the 'year' field.
   * @param value the value to set.
   */
  public void setYear(int value) {
    this.year = value;
  }

  /**
   * Creates a new Book RecordBuilder.
   * @return A new Book RecordBuilder
   */
  public static org.acme.kafka.quarkus.Book.Builder newBuilder() {
    return new org.acme.kafka.quarkus.Book.Builder();
  }

  /**
   * Creates a new Book RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Book RecordBuilder
   */
  public static org.acme.kafka.quarkus.Book.Builder newBuilder(org.acme.kafka.quarkus.Book.Builder other) {
    if (other == null) {
      return new org.acme.kafka.quarkus.Book.Builder();
    } else {
      return new org.acme.kafka.quarkus.Book.Builder(other);
    }
  }

  /**
   * Creates a new Book RecordBuilder by copying an existing Book instance.
   * @param other The existing instance to copy.
   * @return A new Book RecordBuilder
   */
  public static org.acme.kafka.quarkus.Book.Builder newBuilder(org.acme.kafka.quarkus.Book other) {
    if (other == null) {
      return new org.acme.kafka.quarkus.Book.Builder();
    } else {
      return new org.acme.kafka.quarkus.Book.Builder(other);
    }
  }

  /**
   * RecordBuilder for Book instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Book>
    implements org.apache.avro.data.RecordBuilder<Book> {

    private java.lang.String title;
    private java.lang.String editor;
    private int year;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.acme.kafka.quarkus.Book.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.editor)) {
        this.editor = data().deepCopy(fields()[1].schema(), other.editor);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.year)) {
        this.year = data().deepCopy(fields()[2].schema(), other.year);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Book instance
     * @param other The existing instance to copy.
     */
    private Builder(org.acme.kafka.quarkus.Book other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.title)) {
        this.title = data().deepCopy(fields()[0].schema(), other.title);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.editor)) {
        this.editor = data().deepCopy(fields()[1].schema(), other.editor);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.year)) {
        this.year = data().deepCopy(fields()[2].schema(), other.year);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.String getTitle() {
      return title;
    }


    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public org.acme.kafka.quarkus.Book.Builder setTitle(java.lang.String value) {
      validate(fields()[0], value);
      this.title = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public org.acme.kafka.quarkus.Book.Builder clearTitle() {
      title = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'editor' field.
      * @return The value.
      */
    public java.lang.String getEditor() {
      return editor;
    }


    /**
      * Sets the value of the 'editor' field.
      * @param value The value of 'editor'.
      * @return This builder.
      */
    public org.acme.kafka.quarkus.Book.Builder setEditor(java.lang.String value) {
      validate(fields()[1], value);
      this.editor = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'editor' field has been set.
      * @return True if the 'editor' field has been set, false otherwise.
      */
    public boolean hasEditor() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'editor' field.
      * @return This builder.
      */
    public org.acme.kafka.quarkus.Book.Builder clearEditor() {
      editor = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'year' field.
      * @return The value.
      */
    public int getYear() {
      return year;
    }


    /**
      * Sets the value of the 'year' field.
      * @param value The value of 'year'.
      * @return This builder.
      */
    public org.acme.kafka.quarkus.Book.Builder setYear(int value) {
      validate(fields()[2], value);
      this.year = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'year' field has been set.
      * @return True if the 'year' field has been set, false otherwise.
      */
    public boolean hasYear() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'year' field.
      * @return This builder.
      */
    public org.acme.kafka.quarkus.Book.Builder clearYear() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Book build() {
      try {
        Book record = new Book();
        record.title = fieldSetFlags()[0] ? this.title : (java.lang.String) defaultValue(fields()[0]);
        record.editor = fieldSetFlags()[1] ? this.editor : (java.lang.String) defaultValue(fields()[1]);
        record.year = fieldSetFlags()[2] ? this.year : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Book>
    WRITER$ = (org.apache.avro.io.DatumWriter<Book>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Book>
    READER$ = (org.apache.avro.io.DatumReader<Book>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.title);

    out.writeString(this.editor);

    out.writeInt(this.year);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.title = in.readString();

      this.editor = in.readString();

      this.year = in.readInt();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.title = in.readString();
          break;

        case 1:
          this.editor = in.readString();
          break;

        case 2:
          this.year = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










