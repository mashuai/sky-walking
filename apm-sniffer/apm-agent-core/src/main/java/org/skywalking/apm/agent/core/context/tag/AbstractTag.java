package org.skywalking.apm.agent.core.context.tag;

import org.skywalking.apm.agent.core.context.trace.AbstractSpan;
import org.skywalking.apm.agent.core.context.trace.Span;

/**
 * This is the abstract tag.
 * All span's tags inherit from {@link AbstractTag},
 * which provide an easy way to
 * {@link Span#setTag(String, String)} ,
 * {@link Span#setTag(String, Integer)}
 * {@link Span#setTag(String, boolean)} ,
 * <p>
 * Created by wusheng on 2017/2/17.
 */
public abstract class AbstractTag<T> {
    /**
     * The key of this Tag.
     */
    protected final String key;

    public AbstractTag(String tagKey) {
        this.key = tagKey;
    }

    protected abstract void set(AbstractSpan span, T tagValue);

    /**
     * @return the key of this tag.
     */
    public String key() {
        return this.key;
    }
}
