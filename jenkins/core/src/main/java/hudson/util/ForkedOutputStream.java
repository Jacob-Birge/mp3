package hudson.util;

import java.io.IOException;
import java.io.OutputStream;

public abstract class ForkedOutputStream extends OutputStream {

	protected OutputStream lhs;
	protected OutputStream rhs;

	public ForkedOutputStream() {
		super();
	}

	public void write(int b) throws IOException {
	    lhs.write(b);
	    rhs.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
	    lhs.write(b);
	    rhs.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
	    lhs.write(b,off,len);
	    rhs.write(b,off,len);
	}

	@Override
	public void flush() throws IOException {
	    lhs.flush();
	    rhs.flush();
	}

	@Override
	public void close() throws IOException {
	    lhs.close();
	    rhs.close();
	}

}