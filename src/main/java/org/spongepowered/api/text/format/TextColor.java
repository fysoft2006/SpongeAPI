/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.text.format;

import org.spongepowered.api.text.message.Message;

import java.awt.Color;

/**
 * Represents the color of the text of a {@link Message}.
 *
 * @see TextColors
 */
public interface TextColor {

    /**
     * Returns the corresponding {@link Color} for this {@link TextColor}.
     *
     * @return The RGB color of this text color
     */
    Color getColor();

    /**
     * Returns whether this color resets the color to the default one.
     *
     * @return True if this color is the reset color
     */
    boolean isReset();

    /**
     * A Base text color is one that is represented in Minecraft. There are
     * several Base colors provided in Minecraft which are specified in
     * {@link TextColors}. Base extends
     * FormattingCode because it does have a corresponding formatting code; it
     * is a single, pure text color.
     */
    interface Base extends TextColor, FormattingCode {

    }

}
