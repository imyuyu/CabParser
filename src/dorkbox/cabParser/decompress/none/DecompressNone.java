/*
 * Copyright 2012 dorkbox, llc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dorkbox.cabParser.decompress.none;

import dorkbox.cabParser.CabException;
import dorkbox.cabParser.CorruptCabException;
import dorkbox.cabParser.decompress.Decompressor;

public final class DecompressNone implements Decompressor {
    @Override
    public void init(int windowBits) {
    }

    @Override
    public void decompress(byte[] inputBytes, byte[] outputBytes, int inputLength, int outputLength) throws CabException {
        if (inputLength != outputLength) {
            throw new CorruptCabException();
        }
        System.arraycopy(inputBytes, 0, outputBytes, 0, outputLength);
    }

    @Override
    public int getMaxGrowth() {
        return 0;
    }

    @Override
    public void reset(int windowBits) {
    }
}
