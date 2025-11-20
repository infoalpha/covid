import React from 'react';
import './ArchitectureDiagram.css';

const ArchitectureDiagram = () => {
  const handleIconClick = (message) => {
    alert(message);
  };

  return (
    <div className="architecture-diagram">
      {/* Sources Section */}
      <div className="section sources">
        <div className="section-label">SOURCES</div>
        <button className="icon-box" onClick={() => handleIconClick('Source 1 clicked')}>📊</button>
        <button className="icon-box" onClick={() => handleIconClick('Source 2 clicked')}>⚗️</button>
        <button className="icon-box" onClick={() => handleIconClick('Source 3 clicked')}>⚙️</button>
        <button className="icon-box" onClick={() => handleIconClick('Source 4 clicked')}>📊</button>
      </div>

      {/* Components Section (Connections + Platform) */}
      <div className="section components">
        <div className="section-label">COMPONENTS</div>
        
        <div className="components-content">
          {/* Left Connections */}
          <div className="connections-container">
            <div className="connections-label">CONNECTIONS</div>
            <svg className="connections" viewBox="0 0 300 400" preserveAspectRatio="xMidYMid meet">
              <path d="M 0,80 Q 150,80 300,140" stroke="#3b82f6" strokeWidth="3" fill="none" />
              <path d="M 0,140 Q 150,140 300,140" stroke="#06b6d4" strokeWidth="3" fill="none" />
              <path d="M 0,200 Q 150,200 300,140" stroke="#fbbf24" strokeWidth="3" fill="none" />
              <path d="M 0,260 Q 150,260 300,140" stroke="#ec4899" strokeWidth="3" fill="none" />
            </svg>
          </div>

          {/* Center Platform Section */}
          <div className="center-content">
            <div className="platform-section">
              <button className="platform-button">⚡ decodable</button>
              <div className="pipelines-section">
                <div className="pipeline-group">
                  <div className="pipeline-label">SQL PIPELINES</div>
                  <div className="pipeline-icons">
                    <span className="pipeline-icon">➡️</span>
                    <span className="pipeline-icon">💻</span>
                    <span className="pipeline-icon">⚡</span>
                  </div>
                </div>
                <div className="pipeline-group">
                  <div className="pipeline-label">CUSTOM PIPELINES</div>
                  <div className="pipeline-icons">
                    <span className="pipeline-icon">🔷</span>
                    <span className="pipeline-icon">➡️</span>
                    <span className="pipeline-icon">📦</span>
                  </div>
                </div>
              </div>
            </div>
          </div>

          {/* Right Connections */}
          <div className="connections-container">
            <div className="connections-label">CONNECTIONS</div>
            <svg className="connections" viewBox="0 0 300 400" preserveAspectRatio="xMidYMid meet">
              <path d="M 0,150 Q 150,80 300,80" stroke="#3b82f6" strokeWidth="3" fill="none" />
              <path d="M 0,150 Q 150,140 300,140" stroke="#06b6d4" strokeWidth="3" fill="none" />
              <path d="M 0,150 Q 150,200 300,200" stroke="#fbbf24" strokeWidth="3" fill="none" />
              <path d="M 0,150 Q 150,260 300,260" stroke="#ec4899" strokeWidth="3" fill="none" />
            </svg>
          </div>
        </div>
      </div>

      {/* Sinks Section */}
      <div className="section sinks">
        <div className="section-label">SINKS</div>
        <button className="icon-box" onClick={() => handleIconClick('Sink 1 clicked')}>❄️</button>
        <button className="icon-box" onClick={() => handleIconClick('Sink 2 clicked')}>📦</button>
        <button className="icon-box" onClick={() => handleIconClick('Sink 3 clicked')}>📊</button>
        <button className="icon-box" onClick={() => handleIconClick('Sink 4 clicked')}>🎯</button>
      </div>
    </div>
  );
};

export default ArchitectureDiagram;
