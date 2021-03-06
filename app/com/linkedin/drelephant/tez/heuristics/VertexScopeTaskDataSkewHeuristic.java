/*
 * Copyright 2016 LinkedIn Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.linkedin.drelephant.tez.heuristics;

import com.linkedin.drelephant.tez.data.TezCounterData;
import com.linkedin.drelephant.tez.data.TezDAGApplicationData;
import com.linkedin.drelephant.tez.data.TezVertexData;
import com.linkedin.drelephant.configurations.heuristic.HeuristicConfigurationData;


/**
 * This Heuristic analyzes the skewness in the reducer input data
 */
public class VertexScopeTaskDataSkewHeuristic extends GenericDataSkewHeuristic {

  public VertexScopeTaskDataSkewHeuristic(HeuristicConfigurationData heuristicConfData) {
    super(TezCounterData.CounterName.HDFS_BYTES_READ, heuristicConfData);
  }

  @Override
  protected String getTaskType( ) {
    return "scope";
  }
}
